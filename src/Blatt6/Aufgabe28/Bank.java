package Blatt6.Aufgabe28;

import Blatt6.Aufgabe2627.BankAccount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Stream;

public class Bank {
    private final ArrayList<BankAccount> bankAccounts = new ArrayList<>();
    private final HashMap<String, BankAccount> accountMap = new HashMap<>();

    public void createBankAccount(String holderName, String accountNumber) throws IllegalBankingException {
        Stream<BankAccount> equalAccounts = bankAccounts.stream().filter(account -> account.getAccountNumber().equals(accountNumber));
        if (equalAccounts.findAny().isPresent()) throw new IllegalBankingException("Ein Konto mit dieser Kontonummer existiert bereits");

        bankAccounts.add(new BankAccount(holderName, accountNumber));
        accountMap.put(holderName, new BankAccount(holderName, accountNumber));
    }

    public double getBalanceByHolder(String holder) throws IllegalBankingException {
        if (accountMap.containsKey(holder)) {
            return accountMap.get(holder).getBalance();
        } else {
            throw new IllegalBankingException("Dieser Accountinhaber existiert nicht!");
        }
    }

    public void addBalance(String accountNumber, int amount) throws IllegalBankingException {
        boolean isPresent = bankAccounts.stream().anyMatch(account -> account.getAccountNumber().equals(accountNumber));
        if(isPresent) {
            bankAccounts
                    .stream()
                    .filter(account -> account.getAccountNumber().equals(accountNumber))
                    .findFirst()
                    .get()
                    .addBalance(amount);
        } else {
            throw new IllegalBankingException("Ein Konto unter dieser Kontonummer existier nicht");
        }
    }
}
