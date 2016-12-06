package am.app;

/**
 * Created by abbymitchell on 06/12/2016.
 */

public class QuestionRandomiser {

    public int number = 0;
    int[] array = new int[5];

    number = (int) (Math.random() * 5) + 1;

    for (int index = 0; index < 5; index++){           //Creates an index to check that the particular question hasn't been asked before
        if (array[index] == number){
            number = (int) (Math.random() * 5) + 1;     //If the number matches, try another number
        }
        else {
            array[index] = number;                     //Assigns number to array to keep it in memory
                                                     //Stops there not to make the whole array the same number
        }
    }

}
