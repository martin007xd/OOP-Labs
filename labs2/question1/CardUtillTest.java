package question1;
public class CardUtillTest {
    public static void main(String[] args) {
        Card highCard = new Card(Rank.ACE, Suite.SPADES);
        Card nextCard = new Card(Rank.KING, Suite.HEARTS);

        System.out.println("Is high card? " + CardUtill.isHighestCard(highCard));
        System.out.println("Is other card high? " + CardUtill.isHighestCard(nextCard));
    }
}