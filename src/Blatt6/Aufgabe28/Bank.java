package Blatt6.Aufgabe28;

import Blatt6.Aufgabe2627.BankAccount;

import java.util.ArrayList;
import java.util.HashMap;

public class Bank {
    private ArrayList<BankAccount> bankAccounts = new ArrayList<>();
    private HashMap<String, BankAccount> accountMap = new HashMap<String, BankAccount>();

    public void createBankAccount(String holderName, String accountNumber) {
        bankAccounts.forEach(account -> {
            if(account.getAccountNumber().equals(accountNumber)) {
                throw new IllegalBankingException("Diese Kontonummer ist bereits vergeben!");
            }
        });
        bankAccounts.add(new BankAccount(holderName, accountNumber));
        accountMap.put(holderName, 0.0);
    }

    public double getBalanceByHolder(String holder) throws IllegalBankingException {
        if (accountMap.containsKey(holder)) {
            return accountMap.get(holder);
        } else {
            throw new IllegalBankingException("Dieser Accountinhaber existiert nicht!");
        }
    }

    public void addbalance(String accountNumber, double amount) throws IllegalBankingException {

    }
}
