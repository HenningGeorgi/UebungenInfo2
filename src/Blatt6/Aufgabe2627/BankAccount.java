package Blatt6.Aufgabe2627;

import java.time.LocalDate;

public class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private final LocalDate openingDate;
    private double balance = 0;

    public BankAccount(String accountHolderName, String accountNumber) throws IllegalArgumentException {
        setAccountHolderName(accountHolderName);
        setAccountNumber(accountNumber);
        openingDate = LocalDate.now();
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) throws IllegalArgumentException {
        if (!accountHolderName.matches("(\\p{Upper}.*)*")) throw new IllegalArgumentException("Ungültiger Name");
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    private void setAccountNumber(String accountNumber) throws IllegalArgumentException {
        if (!accountHolderName.matches("(\\p{Upper}*\\d*){12}")) throw new IllegalArgumentException("Ungültige Kontonummer");
        this.accountNumber = accountNumber;
    }

    public LocalDate getOpeningDate() {
        return openingDate;
    }

    public double getBalance() {
        return balance;
    }

    public void addBalance(double amount) {
        this.balance += amount;
    }
    public void subBalance(double amount) {
        this.balance -= amount;
    }

    public boolean equal(BankAccount compareAccount) {
        return accountNumber.equals(compareAccount.getAccountNumber());
    }
}
