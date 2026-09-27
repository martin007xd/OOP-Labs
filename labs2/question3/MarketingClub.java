package question3;
public class MarketingClub extends Club {
    private int budget;

    public MarketingClub(String c, int m, int b) {
        super(c, m);
        this.budget = b;
    }

    public boolean useBudget(int amount) {
        if ((this.budget - amount) < 0) {
            return false;
        }
        this.budget = this.budget - amount;
        return true;
    }

    public int determineBudget() {
        if (this.budget > 1000) {
            return 0;
        }
        return super.determineBudget();
    }
}