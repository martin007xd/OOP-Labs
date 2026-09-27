package question2;
public class Basketballplayer extends Player {
    public Basketballplayer(String n , int j){
        super(n, j);
    }

    public void PlayGame(){
        MinutesPlayed = MinutesPlayed + 48;
    }

    public void changeJerseyNumber(int newNumber) {
        JerseyNumber = newNumber;
        System.out.println(name + " changes number to : " + JerseyNumber);
    }   
}
