package question2;
public abstract class Player {
    protected String name;
    protected int JerseyNumber;
    protected int MinutesPlayed;

    public Player(String n , int j){
        name = n;
        JerseyNumber = j;
        MinutesPlayed = 0;
    }

    public void print(){
        System.out.println(name + " : " + JerseyNumber);
    }

    public int getMinutesPlayed(){
        return MinutesPlayed;
    }

    public abstract void PlayGame();
    
}

