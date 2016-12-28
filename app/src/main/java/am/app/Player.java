package am.app;

import android.content.Context;
import android.content.SharedPreferences;

import java.lang.reflect.Array;

/**
 * Created by abbymitchell on 04/12/2016.
 */

//Class for Player (defines the object)

public class Player implements Comparable<Player> {

    public String name;
    public int score;
    public int randomPlace;
    public int randomPlace2;


    private SharedPreferences HSc;
    public static final String H_SC = "High Score";

    public Player(){
        //Initially, the player has no name or score
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

    public String scoreToString(){
        return (Integer.toString(score));
    }

    public void scoreToHighScore(){
        randomPlace = (int)(Math.random()*10); //generates random number between 0 and 10
        Player highScorePlayer = new Player(CreatePlayer.player); //copy of player created


        while(HighScoreArray.High_Scores[randomPlace] != CreatePlayer.defaultPlayer){ //if place in array taken by a previous player's scores,
            randomPlace=(int)(Math.random()*10);}                                     // a different array place numebr is generates

        HighScoreArray.High_Scores[randomPlace] = highScorePlayer; //copied player assigned to randomly generated place number
    }

    public void scoreToHighScorePlayer1(){ //same as above method, for player 1 of multiplayer
        Player highScorePlayer1 = new Player(CreatePlayer.player1);
        randomPlace = (int)(Math.random()*10);

        while(HighScoreArray.High_Scores[randomPlace] != CreatePlayer.defaultPlayer){
            randomPlace=(int)(Math.random()*10);}

        HighScoreArray.High_Scores[randomPlace] = highScorePlayer1;
    }

    public void scoreToHighScorePlayer2(){ //same as above method, for player 2 of multiplayer
        Player highScorePlayer2 = new Player(CreatePlayer.player2);
        randomPlace = (int)(Math.random()*10);

        while(HighScoreArray.High_Scores[randomPlace] != CreatePlayer.defaultPlayer){
            randomPlace=(int)(Math.random()*10);}

        HighScoreArray.High_Scores[randomPlace] = highScorePlayer2;

    }


    public String ScoreToString(){ //assigns player data name and score to string value
        return (name + "\t-\t" + score);
    }

    @Override
    public int compareTo(Player comparePlayer) { //compares player scores for high scores array
        int compareScore = ((Player) comparePlayer).getScore();
        return compareScore - this.score;

    }

    public Player(Player aPlayer){ //copy constructor
        name = aPlayer.name;
        score = aPlayer.score;
    }
}