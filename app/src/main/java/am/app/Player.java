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
    public int randomPlace2;
    //Player player = new Player();
    //public Player player1 = new Player();
    //public Player player2 = new Player();

    private SharedPreferences HSc;
    public static final String H_SC = "High Score";

    public Player(){
        name = "null";
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

    public void scoreToHighScore(){
        randomPlace = (int)(Math.random()*10);
        Player highScorePlayer = new Player(CreatePlayer.player);


        while(HighScoreArray.High_Scores[randomPlace] != CreatePlayer.defaultPlayer){
            randomPlace=(int)(Math.random()*10);}

        HighScoreArray.High_Scores[randomPlace] = highScorePlayer;
    }

    public void scoreToHighScorePlayer1(){
        Player highScorePlayer1 = new Player(CreatePlayer.player1);
        randomPlace = (int)(Math.random()*10);

        while(HighScoreArray.High_Scores[randomPlace] != CreatePlayer.defaultPlayer){
            randomPlace=(int)(Math.random()*10);}

        HighScoreArray.High_Scores[randomPlace] = highScorePlayer1;
    }

    public void scoreToHighScorePlayer2(){
        Player highScorePlayer2 = new Player(CreatePlayer.player2);
        randomPlace = (int)(Math.random()*10);

        while(HighScoreArray.High_Scores[randomPlace] != CreatePlayer.defaultPlayer){
            randomPlace=(int)(Math.random()*10);}

        HighScoreArray.High_Scores[randomPlace] = highScorePlayer2;

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