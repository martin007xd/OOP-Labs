package question1_4;

public class ClubManagingSystem {
    private Club[] clubList;

    public ClubManagingSystem(Club[] clubList) {
        this.clubList = clubList;
    }

    public int determineAllBudget() {
        int total = 0;
        for (Club c : clubList) {
            total += c.determineBudget();
        }
        return total;
    }

    public int getAllMembers() {
        int total = 0;
        for (Club c : clubList) {
            total += c.NumMember; 
        }
        return total;
    }

    public Club getHighestMemberClub() {
        if (clubList == null || clubList.length == 0) return null;

        Club highest = clubList[0];
        for (Club c : clubList) {
            if (c.NumMember > highest.NumMember) { 
                highest = c;
            }
        }
        return highest;
    }
}