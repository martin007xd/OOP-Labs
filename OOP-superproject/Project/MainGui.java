package Project;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainGui extends JFrame {
    private ArrayList<TransactionInterface> transactionList = new ArrayList<>();
    private JLabel balanceLabel;
    
    private AddGui addGUI;

    public MainGui() {
        setTitle("Income-Expense System (Final Version)");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1, 10, 10));

        balanceLabel = new JLabel("Amount left : 0.0 Bath", SwingConstants.CENTER);
        balanceLabel.setFont(new Font("Tahoma", Font.BOLD, 24));

        JButton btnAdd = new JButton("Add");
        JButton btnSearch = new JButton("Search");
        JButton btnExit = new JButton("Exit");

        btnAdd.addActionListener(e -> {
            if (addGUI == null || !addGUI.isDisplayable()) {
                addGUI = new AddGui(this);
            } else {
                addGUI.setVisible(true);
                addGUI.toFront();
            }
        });
        
        btnSearch.addActionListener(e -> new SearchGui(this));
        btnExit.addActionListener(e -> System.exit(0));

        add(balanceLabel);
        add(btnAdd);
        add(btnSearch);
        add(btnExit);
        setLocationRelativeTo(null);
    }

    public ArrayList<TransactionInterface> getTransactionList() {
        return transactionList;
    }

    public void addTransaction(TransactionInterface t) {
        transactionList.add(t);
        updateBalance();
        
        if (addGUI != null && addGUI.isDisplayable()) {
            addGUI.updateDisplay();
        }
    }

    private void updateBalance() {
        double total = 0;
        for (TransactionInterface t : transactionList) {
            if (t instanceof Income) {
                total += t.getAmount();
            } else if (t instanceof Expense) {
                total -= t.getAmount();
            }
        }
        balanceLabel.setText("Amount : " + total + " Bath");
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainGui().setVisible(true);
        });
    }
}