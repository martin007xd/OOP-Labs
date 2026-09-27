package question2;
public class Footballplayer extends Player{
    public Footballplayer(String n , int j){
        super(n, j);
    }

    public void PlayGame(){
        MinutesPlayed = MinutesPlayed + 90;
    }
}
