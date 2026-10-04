package question1_4;

public final class ESportsClub extends Sportclub {

    public ESportsClub(String c, int m) {
        super(c, m);
        this.MinNumMember = 1; 
    }

    public final void advertise() { 
        System.out.println("No need to advertise");
    }
}