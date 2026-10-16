package project1;
public final class Expense extends Transaction {
    private final String category;

    public Expense(String id, String date, double amount, String memo, String category) {
        super(id, date, amount, memo);
        this.category = category;
    }

    public String getCategory() { return this.category; }

    @Override
    public String getDetails() {
        return "[Expense] ID : " + id + " | Date : " + date + " | Amount : " + amount + " Bath | Category : " + category + " (" + memo + ")";
    }
}