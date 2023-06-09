package Blatt10.gui;

import Blatt10.data.BankAccount;
import Blatt10.data.BankAccountContainer;
import Blatt10.data.IllegalBankingException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BankGUI extends JFrame implements ActionListener {
    private BankAccountContainer bankAccountContainer = BankAccountContainer.instance();

    public BankGUI() {
        super("Bank Manager");
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        JPanel panelSouth = new JPanel();
        JButton btnShowAccounts = new JButton("Show all bank accounts");
        btnShowAccounts.addActionListener(this);
        panelSouth.add(btnShowAccounts);
        JButton btnBalanceByHolder = new JButton("Calculate total balance for a holder");
        btnBalanceByHolder.addActionListener(this);
        panelSouth.add(btnBalanceByHolder);

        JButton btnClose = new JButton("Close application");
        btnClose.addActionListener(this);
        panelSouth.add(btnClose);
        this.add(panelSouth, BorderLayout.SOUTH);

        setSize(600, 200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Show all bank accounts")) {
            onList();
        } else if (e.getActionCommand().equals("Calculate total balance for a holder")) {
            onBalanceByHolder();
        } else if (e.getActionCommand().equals("Close application")) {
            onClose();
        }
    }

    private void onList() {
        new ListBankAccounts(this);
    }

    private void onBalanceByHolder() {
        String name = JOptionPane.showInputDialog(this, "Enter holder name");
        double sum = 0;
        for (BankAccount b : bankAccountContainer) {
            if (b.getAccountHolderName().equals(name)) {
                sum += b.getBalance();
            }

        }
        JOptionPane.showMessageDialog(this, name + " holds " + sum + "euros in total");
    }

    private void onClose() {
        dispose();
        System.exit(0);
    }

    public static void main(String[] args) {
        BankAccountContainer container = BankAccountContainer.instance();
        try {
            BankAccount temp = new BankAccount("Dagobert Duck", "ENTENHAUSEN1");
            temp.addBalance(23561.65);
            container.linkBankAccount(temp);
            temp = new BankAccount("Dagobert Duck", "ENTENHAUSEN2");
            temp.addBalance(336.09);
            container.linkBankAccount(temp);
            temp = new BankAccount("Dagobert Duck", "ENTENHAUSEN3");
            temp.addBalance(123226.09);
            container.linkBankAccount(temp);
            temp = new BankAccount("Donald Duck", "ENTENHAUSEN4");
            temp.addBalance(- 3461.65);
            container.linkBankAccount(temp);
            temp = new BankAccount("Donald Duck", "PHANTOMIAS12");
            temp.addBalance(44239.50);
            container.linkBankAccount(temp);
            temp = new BankAccount("Klaas Klever", "ENTENHAUSEN5");
            temp.addBalance(546753.12);
            container.linkBankAccount(temp);
        } catch (IllegalBankingException e) {
            throw new RuntimeException(e);
        }
        new BankGUI();
    }
}
