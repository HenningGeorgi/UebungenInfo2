package Blatt10.data;

import Blatt6.Aufgabe28.IllegalBankingException;
import org.jetbrains.annotations.NotNull;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class BankAccountContainer implements Iterable<BankAccount> {
    private ArrayList<BankAccount> bankAccounts;
    private static BankAccountContainer unique = null;
    private static int counter;
    private PropertyChangeSupport changes = new PropertyChangeSupport(this);

    private BankAccountContainer() {
        bankAccounts = new ArrayList<BankAccount>();
    }

    public static BankAccountContainer instance() {
        if (unique == null)
            unique = new BankAccountContainer();
        return unique;
    }

    public void linkBankAccount(BankAccount a) throws IllegalBankingException {
        if (this.bankAccounts.contains(a))
            throw new IllegalBankingException("Bankaccount already exists");
        this.bankAccounts.add(a);
        ++counter;
        changes.firePropertyChange("link bankAccount", null, a);
    }

    public void unlinkBankAccount(BankAccount a) {
        if (!this.bankAccounts.contains(a))
            return;
        this.bankAccounts.remove(a);
        changes.firePropertyChange("unlink bankAccount", a, null);
    }

    public void addPropertyChangeListener(PropertyChangeListener l) {
        changes.addPropertyChangeListener(l);
    }

    public void removePropertyChangeListener(PropertyChangeListener l) {
        changes.removePropertyChangeListener(l);
    }

    @NotNull
    @Override
    public Iterator<BankAccount> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super BankAccount> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<BankAccount> spliterator() {
        return Iterable.super.spliterator();
    }
}
