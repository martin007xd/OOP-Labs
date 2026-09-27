package question1;
public class Card {
    private Rank rank;
    private Suite suite;

    public Card(Rank r, Suite s){
        this.rank = r;
        this.suite = s;
    }

    public Rank getRank(){
        return rank;
    }

    public Suite getSuite(){
        return suite;
    }

    public void setRank(){
        this.rank = rank;
    }

    public void setSuite(){
        this.suite = suite;
    }
}
