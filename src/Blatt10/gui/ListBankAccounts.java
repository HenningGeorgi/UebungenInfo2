package Blatt10.gui;

import Blatt10.data.BankAccount;
import Blatt10.data.BankAccountContainer;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Vector;

public class ListBankAccounts extends JDialog implements ActionListener, PropertyChangeListener {
    private BankAccountContainer bankAccountContainer;
    private JList<BankAccount> bankAccountList;

    public ListBankAccounts(BankGUI parent) {
        super(parent, "Show all bank accounts", false);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        JLabel lblAllBankAccounts = new JLabel("All bank accounts: ");
        add(lblAllBankAccounts, BorderLayout.NORTH);
        bankAccountList = new JList<>();
        add(bankAccountList, BorderLayout.CENTER);

        JPanel buttons = new JPanel();
        add(buttons, BorderLayout.SOUTH);
        JButton cancel = new JButton("Cancel");
        cancel.addActionListener(this);
        buttons.add(cancel);
        JButton delete = new JButton("Delete bank account");
        delete.addActionListener(this);
        buttons.add(delete);
        JButton edit = new JButton("Edit bank account");
        edit.addActionListener(this);
        buttons.add(edit);

        setLocation(parent.getLocation().x + 200, parent.getLocation().y + 200);

        bankAccountContainer = BankAccountContainer.instance();
        bankAccountContainer.addPropertyChangeListener(this);
        for (BankAccount b : bankAccountContainer) {
            b.addPropertyChangeListener(this);
        }
        updateList();
        pack();
        setVisible(true);
    }

    @Override
    public void propertyChange(PropertyChangeEvent e) {
        updateList();
        if (e.getPropertyName().equals("bankAccount")) {
            BankAccount b = (BankAccount) e.getNewValue();
            if (b != null)
                b.addPropertyChangeListener(this);
            else {
                b = (BankAccount) e.getOldValue();
                b.removePropertyChangeListener(this);
            }
        }
    }

    private void updateList() {
        Vector<BankAccount> v = new Vector<BankAccount>();
        for (BankAccount b : bankAccountContainer)
            v.add(b);
        bankAccountList.setListData(v);
        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Delete bank account")) {
            onDelete();
        } else if (e.getActionCommand().equals("Cancel")) {
            onCancel();
        } else if (e.getActionCommand().equals("Edit bank account")) {
            onEdit();
        }
    }

    private void onDelete() {
        if (bankAccountList.isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "No bankAccount selected:\n", "Error", JOptionPane.ERROR_MESSAGE);
        }
        bankAccountContainer.unlinkBankAccount(bankAccountList.getSelectedValue());
    }

    private void onEdit() {
        if (bankAccountList.isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "No bankAccount selected:\n", "Error", JOptionPane.ERROR_MESSAGE);
        }
        new ChangeBankAccount(this, bankAccountList.getSelectedValue());
    }

    private void onCancel() {
        dispose();
    }
}
