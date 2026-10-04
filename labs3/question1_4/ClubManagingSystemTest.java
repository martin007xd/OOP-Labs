package question1_4;

public class ClubManagingSystemTest {
    public static void main(String[] args) {
        Club[] clubs = new Club[4];

        clubs[0] = new Club("Student", 10);
        clubs[0].addMember(190);

        clubs[1] = new Sportclub("Football", 22); 
        clubs[1].addMember(18);

        clubs[2] = new ESportsClub("RoV", 5);

        clubs[3] = new MarketingClub("Advertising", 2, 100); 
        clubs[3].addMember(8);

        ClubManagingSystem system = new ClubManagingSystem(clubs);

        System.out.println("Highest Member Club: " + system.getHighestMemberClub().getName());
        System.out.println("Total Budget: " + system.determineAllBudget());
        System.out.println("Total Members: " + system.getAllMembers());
    }
}