package am.app;

import java.util.Arrays;

/**
 * Created by abbymitchell on 11/12/2016.
 */

public class HighScoreArray {
    public static Player[] High_Scores = new Player[10];
    public static String[] High_Scores_Strings = new String[10];


    public static void arraySetValues(){
        High_Scores[0] = CreatePlayer.defaultPlayer;
        High_Scores[1] = CreatePlayer.defaultPlayer;
        High_Scores[2] = CreatePlayer.defaultPlayer;
        High_Scores[3] = CreatePlayer.defaultPlayer;
        High_Scores[4] = CreatePlayer.defaultPlayer;
        High_Scores[5] = CreatePlayer.defaultPlayer;
        High_Scores[6] = CreatePlayer.defaultPlayer;
        High_Scores[7] = CreatePlayer.defaultPlayer;
        High_Scores[8] = CreatePlayer.defaultPlayer;
        High_Scores[9] = CreatePlayer.defaultPlayer;}


    //public static int[] ScoresArray = new int[10];
    //public static String[] HighScoresStrings = new String[High_Scores.length];


    public static void arrayToString(){
        for (int index = 0; index<High_Scores.length; index++){
            High_Scores_Strings[index] = High_Scores[index].ScoreToString();
        }
    }

    //public static void arrayValueToString()

    /*public static String HighScoresToString() {
        String[] HighScoresStrings = Arrays.copyOf(High_Scores, High_Scores.length, String[].class);
        return HighScoresStrings.toString();
    }*/

    /*public static void sort(Comparable[] a){
        for (int index=0; index<a.length -1; index++)
            swap(index, indexOfSmallestFrom(index, a), a);
    }

    private static int indexOfSmallestFrom(int startIndex, Comparable[] a){
        int indexOfMin = startIndex;
        for (int index = startIndex + 1; index < a.length; index++)
            if (a[index].compareTo(a[indexOfMin])<0)
                indexOfMin = index;
        return indexOfMin;
    }

    private static void swap(int i, int j, Comparable[] a){
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


    @Override
    public int compareTo(HighScoreArray highScoreArray) {
        return 0;
    }*/
}
