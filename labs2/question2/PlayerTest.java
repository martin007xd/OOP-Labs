package question2;
public class PlayerTest {
    public static void main(String[] args) {
        Footballplayer f = new Footballplayer("Ronaldo", 7);
        Basketballplayer b = new Basketballplayer("James", 23);
        
        f.print();
        b.print();
        
        f.PlayGame();
        b.PlayGame();
        
        System.out.println(f.getMinutesPlayed());
        System.out.println(b.getMinutesPlayed());
        
        b.changeJerseyNumber(6);
    }
}

