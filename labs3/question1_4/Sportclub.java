package question1_4;

public class Sportclub extends Club {
    public Sportclub(String c, int m) {
        super(c, m);
    }

    public int getNumMember() {
        return NumMember;
    }

    public int determineBudget() {
        return (NumMember * 1000) + ((NumMember - MinNumMember) * 100);
    }

    public void changename(String newname) {
    }
}