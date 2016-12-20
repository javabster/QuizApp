package am.app;

import android.content.Context;
import android.content.SharedPreferences;

import java.lang.reflect.Array;

/**
 * Created by abbymitchell on 04/12/2016.
 */

public class Player implements Comparable<Player> {

    public String name;
    public int score;
    public int randomPlace;
    //Player player = new Player();
    //public Player player1 = new Player();
    //public Player player2 = new Player();

    private SharedPreferences HSc;
    public static final String H_SC = "High Score";

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

    public String scoreToString(){
        return (Integer.toString(score));
    }

    public void scoreToHighScore(){                    //change to a do while loop maybe????
        randomPlace = (int)(Math.random()*10);
        Player highScorePlayer = new Player(CreatePlayer.player);

        while(HighScoreArray.High_Scores[randomPlace] != CreatePlayer.defaultPlayer){
            randomPlace=(int)(Math.random()*10);}

        HighScoreArray.High_Scores[randomPlace] = highScorePlayer;
        //HighScoreArray.High_Scores[randomPlace]

        /*if (HighScoreArray.High_Scores[randomPlace] == null)
        HighScoreArray.High_Scores[randomPlace] = CreatePlayer.player;
        else{
            randomPlace = (int)(Math.random()*10);
            HighScoreArray.High_Scores[randomPlace] = CreatePlayer.player;
        }*/


    }

    public String ScoreToString(){
        return (name + "\t-\t" + score);
    }

    @Override
    public int compareTo(Player comparePlayer) {
        int compareScore = ((Player) comparePlayer).getScore();
        return compareScore - this.score;

    }

    public Player(Player aPlayer){
        name = aPlayer.name;
        score = aPlayer.score;
    }
}