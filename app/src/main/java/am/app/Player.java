package am.app;

/**
 * Created by abbymitchell on 04/12/2016.
 */

public class Player {

    public String name;
    public int score;
    //public Player player = new Player();
    //public Player player1 = new Player();
    //public Player player2 = new Player();

    public Player(){
        name = "Joe";
        score = 0;
    }

    public Player(String theName, int theScore){
        name=theName;
        score=theScore;
    }



    public String getName(){
        return name;
    }

    public int getScore(){
        return score;
    }

    public void setName(String newName){
        name = newName;
    }

    public void setScore(int newScore){
        score = newScore;
    }

    public void addScore(int addition){
        score = score + addition;
    }

    public void minusScore(int subtraction){
        score = score - subtraction;
    }

}