package am.app;

import java.util.Arrays;

/**
 * Created by abbymitchell on 11/12/2016.
 */

//Class for the high score array of the game

public class HighScoreArray {
    public static Player[] High_Scores = new Player[10]; //Board displays top 10 players
    public static String[] High_Scores_Strings = new String[10];


    public static void arraySetValues(){
        High_Scores[0] = CreatePlayer.defaultPlayer; //defaultPlayer has no name or score, so they are all null
        High_Scores[1] = CreatePlayer.defaultPlayer;
        High_Scores[2] = CreatePlayer.defaultPlayer;
        High_Scores[3] = CreatePlayer.defaultPlayer;
        High_Scores[4] = CreatePlayer.defaultPlayer;
        High_Scores[5] = CreatePlayer.defaultPlayer;
        High_Scores[6] = CreatePlayer.defaultPlayer;
        High_Scores[7] = CreatePlayer.defaultPlayer;
        High_Scores[8] = CreatePlayer.defaultPlayer;
        High_Scores[9] = CreatePlayer.defaultPlayer;}




    public static void arrayToString(){
        for (int index = 0; index<High_Scores.length; index++){
            High_Scores_Strings[index] = High_Scores[index].ScoreToString();
        }
    }

}
