package project1;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class SearchGui extends JFrame {
    private MainGui mainPage;

    public SearchGui(MainGui mainPage) {
        this.mainPage = mainPage;
        setTitle("Search");
        setSize(500, 400);
        setLayout(new BorderLayout());

        JPanel searchPanel = new JPanel(new FlowLayout());
        
        String[] criteria = {
            "Search (All)", 
            "Id-Password (ID)",
            "Date", 
            "Save (Memo)",
            "Income Source", 
            "Expense Category "
        };
        JComboBox<String> cbCriteria = new JComboBox<>(criteria);
        JTextField txtSearch = new JTextField(15);
        JButton btnSearch = new JButton("Search");

        searchPanel.add(new JLabel("Search From:"));
        searchPanel.add(cbCriteria);
        searchPanel.add(txtSearch);
        searchPanel.add(btnSearch);

        add(searchPanel, BorderLayout.NORTH);

        JTextArea resultArea = new JTextArea();
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);
        add(scrollPane, BorderLayout.CENTER);

        btnSearch.addActionListener(e -> {
            String criterion = (String) cbCriteria.getSelectedItem();
            String keyword = txtSearch.getText().trim().toLowerCase();
            StringBuilder results = new StringBuilder();
            ArrayList<TransactionInterface> list = mainPage.getTransactionList();
            
            boolean found = false;

            for (TransactionInterface t : list) {
                if (criterion.equals("Search (All)")) {
                    if (t.getDetails().toLowerCase().contains(keyword)) {
                        results.append(t.getDetails()).append("\n");
                        found = true;
                    }
                }
                else if (criterion.equals("Id-Password (ID)")) {
                    if (t.getId().toLowerCase().contains(keyword)) {
                        results.append(t.getDetails()).append("\n");
                        found = true;
                    }
                }
                else if (criterion.equals("Date")) {
                    if (t.getDate().toLowerCase().contains(keyword)) {
                        results.append(t.getDetails()).append("\n");
                        found = true;
                    }
                } 
                else if (criterion.equals("Save (Memo)")) {
                    if (t.getMemo().toLowerCase().contains(keyword)) {
                        results.append(t.getDetails()).append("\n");
                        found = true;
                    }
                }
                else if (criterion.equals("Income Source")) {
                    if (t instanceof Income) {
                        Income inc = (Income) t;
                        if (inc.getSource().toLowerCase().contains(keyword)) {
                            results.append(t.getDetails()).append("\n");
                            found = true;
                        }
                    }
                } 
                else if (criterion.equals("Expense Category ")) {
                    if (t instanceof Expense) {
                        Expense exp = (Expense) t;
                        if (exp.getCategory().toLowerCase().contains(keyword)) {
                            results.append(t.getDetails()).append("\n");
                            found = true;
                        }
                    }
                }
            }
            
            if (!found) {
                resultArea.setText("Cannot find information");
            } else {
                resultArea.setText(results.toString());
            }
        });
        
        setLocationRelativeTo(mainPage);
        setVisible(true);
    }
}