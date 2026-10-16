package Project;
public abstract class Transaction implements TransactionInterface {
    protected final String id;
    protected final String date;
    protected final double amount;
    protected final String memo;

    public Transaction(String id, String date, double amount, String memo) {
        if (amount < 0) {
            throw new IllegalArgumentException("amount cant be -!");
        }
        this.id = id;
        this.date = date;
        this.amount = amount;
        this.memo = memo;
    }

    @Override
    public final String getId() { 
        return this.id; 
    }
    
    @Override
    public final String getMemo() { 
        return this.memo; 
    }
    
    @Override
    public final double getAmount() { 
        return this.amount; 
    }
    
    @Override
    public final String getDate() { 
        return this.date; 
    }

    @Override
    public abstract String getDetails();
}