package question3;
public class Club {
    protected String clubname;
    protected int MinNumMember;
    protected int NumMember;

    public Club(String c, int m) {
        clubname = c;
        MinNumMember = m;
        NumMember = m; 
    }

    public void addMember(int num) {
        NumMember = NumMember + num;
    }

    public void changename(String newname) {
        clubname = newname;
    }

    public String getName() {
        return clubname;
    }

    public int determineBudget() {
        return (NumMember * 1000);
    }

    public void advertise() {
        System.out.print("Please Join Club : " + clubname);
    }
}