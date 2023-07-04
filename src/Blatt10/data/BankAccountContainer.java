package Blatt10.data;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class BankAccountContainer implements Iterable<BankAccount> {
    private ArrayList<BankAccount> bankAccounts;
    private static BankAccountContainer unique = null;

    private BankAccountContainer() {
        bankAccounts = new ArrayList<BankAccount>();
    }

    public static BankAccountContainer instance() {
        if (unique == null)
            unique = new BankAccountContainer();
        return unique;
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
