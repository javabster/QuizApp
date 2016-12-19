package am.app;

import java.util.Arrays;

/**
 * Created by abbymitchell on 11/12/2016.
 */

public class HighScoreArray {
    public static String[] High_Scores = new String[10];
    //public static String[] HighScoresStrings = new String[High_Scores.length];


    /*public static String HighScoresToString() {
        String[] HighScoresStrings = Arrays.copyOf(High_Scores, High_Scores.length, String[].class);
        return HighScoresStrings.toString();
    }*/


    public static void sort(Comparable[] a){
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





}
