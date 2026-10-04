package question1_4;

public class ESportsClubTest {
    public static void main(String[] args) {
        System.out.println("--- Testing ESportsClub e ---");
        ESportsClub e = new ESportsClub("Esport", 100);
        e.advertise();
        System.out.println("Budget: " + e.determineBudget());
        System.out.println("Name: " + e.getName());

        System.out.println("\n--- Testing Club c ---");
        Club c = new ESportsClub("Esport", 100);
        c.advertise();
        System.out.println("Budget: " + c.determineBudget());
        System.out.println("Name: " + c.getName());
    }
}