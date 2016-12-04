/**
 * Created by abbymitchell on 04/12/2016.
 */

public class Player {

    public String name;
    public int score;

    public Player(){
        name = Joe;
        score = 0;
    }

    public Player(theName, theScore){
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

}
