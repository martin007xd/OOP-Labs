package Project;

import javax.swing.*;

import java.awt.*;

public class AddGui extends JFrame {
    private MainGui mainPage;
    private JTextArea displayArea;

    public AddGui(MainGui mainPage) {
        this.mainPage = mainPage;
        setTitle("Add list");
        setSize(400, 500);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(7, 2, 5, 5));
        
        inputPanel.add(new JLabel("ID:"));
        JTextField txtId = new JTextField();
        inputPanel.add(txtId);

        inputPanel.add(new JLabel("DD/MM/YYYY:"));
        JTextField txtDate = new JTextField();
        inputPanel.add(txtDate);

        inputPanel.add(new JLabel(" Amount (Bath) : "));
        JTextField txtAmount = new JTextField();
        inputPanel.add(txtAmount);

        inputPanel.add(new JLabel(" Memo:"));
        JTextField txtMemo = new JTextField();
        inputPanel.add(txtMemo);

        inputPanel.add(new JLabel(" Source / Category: "));
        JTextField txtSourceCat = new JTextField();
        inputPanel.add(txtSourceCat);

        JRadioButton rbIncome = new JRadioButton("Income (+)");
        JRadioButton rbExpense = new JRadioButton("Expense (-)");
        ButtonGroup bg = new ButtonGroup();
        bg.add(rbIncome);
        bg.add(rbExpense);
        rbIncome.setSelected(true);
        inputPanel.add(rbIncome);
        inputPanel.add(rbExpense);

        JButton btnSave = new JButton("Save");
        inputPanel.add(new JLabel(""));
        inputPanel.add(btnSave);

        add(inputPanel, BorderLayout.NORTH);

        displayArea = new JTextArea();
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);
        add(scrollPane, BorderLayout.CENTER);
        
        updateDisplay();

        btnSave.addActionListener(e -> {
            try {
                String id = txtId.getText().trim();
                String date = txtDate.getText().trim();
                double amount = Double.parseDouble(txtAmount.getText().trim());
                String memo = txtMemo.getText().trim();
                String sourceCat = txtSourceCat.getText().trim();

                Transaction t;
                if (rbIncome.isSelected()) {
                    t = new Income(id, date, amount, memo, sourceCat);
                } else {
                    t = new Expense(id, date, amount, memo, sourceCat);
                }

                mainPage.addTransaction(t);
                
                JOptionPane.showMessageDialog(this, "Save Successful!");
                
                txtId.setText("");
                txtDate.setText("");
                txtAmount.setText("");
                txtMemo.setText("");
                txtSourceCat.setText("");

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please Field Amount", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        
        setLocationRelativeTo(mainPage);
        setVisible(true);
    }
 
    public void updateDisplay() {
        StringBuilder sb = new StringBuilder();
        sb.append("All list:\n");
        sb.append("--------------------------------------------------\n");
        for (TransactionInterface t : mainPage.getTransactionList()) {
            sb.append(t.getDetails()).append("\n");
        }
        displayArea.setText(sb.toString());
        displayArea.setCaretPosition(displayArea.getDocument().getLength());
    }
}