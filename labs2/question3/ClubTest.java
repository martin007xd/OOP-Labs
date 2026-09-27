package question3;

public class ClubTest {
    public static void main(String[] args) {
        System.out.println("CLUB");
        Sportclub sc = new Sportclub("Manchester City", 17);
        sc.addMember(5);

        System.out.println("Sport Club Budget : " + sc.determineBudget());
        sc.changename("Man CITY");
        System.out.println("Sport Club Name : " + sc.getName());
        System.out.println();

        System.out.println("MARKETING");
        MarketingClub mc = new MarketingClub("Global Marketing", 5, 1500);
        
        System.out.println("MarketingClub Budget (budget > 1000): " + mc.determineBudget());
        System.out.println("Use budget 1000? " + mc.useBudget(1000));
        System.out.println("MarketingClub Budget (budget <= 1000): " + mc.determineBudget());
        System.out.println("Use budget 2000? " + mc.useBudget(2000));
    }
}