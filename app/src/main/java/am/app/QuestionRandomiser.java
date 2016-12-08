package am.app;

/**
 * Created by abbymitchell on 06/12/2016.
 */

public class QuestionRandomiser {

    public int number = 0;
    int[] array = new int[10];                                                                       //Create an empty array of length 5

    public void QuestionRandomiser{

        number = (int) (Math.random() * 10);                                                        //Variable is given a random value from 0 to 5

        if (Questions_Array[number] == null){

            number = (int) (Math.random() * 10);

        }
        else {
            getQuestion(number);                                                             //The value becomes the index of the QuestionsArray, and gets the question
            Questions_Array[number] == null;                                                        //Element at the given index becomes null
        }

    }
}
