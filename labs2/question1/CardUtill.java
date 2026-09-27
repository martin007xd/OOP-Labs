package question1;
public class CardUtill {
    public static final Rank HIGHEST_RANK = Rank.ACE;
    public static final Suite HIGHEST_SUITE = Suite.SPADES;

    private CardUtill() {} 

    public static boolean isHighestCard(Card card) {
        if (card == null) {
            return false;
        }
        return card.getRank() == HIGHEST_RANK && card.getSuite() == HIGHEST_SUITE;
    }
}