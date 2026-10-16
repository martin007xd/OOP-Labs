package project1;
public final class Income extends Transaction {
    private final String source;

    public Income(String id, String date, double amount, String memo, String source) {
        super(id, date, amount, memo);
        this.source = source;
    }

    public String getSource() { return this.source; }

    @Override
    public String getDetails() {
        return "[Income] ID : " + id + " | Date : " + date + " | Amount : " + amount + " Bath | Source : " + source + " (" + memo + ")";
    }
}