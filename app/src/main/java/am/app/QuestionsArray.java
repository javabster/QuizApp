package am.app;

/**
 * Created by mateiborc on 08/12/2016.
 */

public class QuestionsArray {

    public static String[] Questions_Array = new String[10];                        //Creates a array of strings containing the questions{

    public void Enter_String_Name(){
        Questions_Array[0] = "What is the largest mammal on Earth? ";                               //Each question has an index
        Questions_Array[1] = "In what year did the Berlin Wall fall? ";
        Questions_Array[2] = "What is the capital of Canada? ";
        Questions_Array[3] = "What is the smallest country in the world? ";
        Questions_Array[4] = "What is the strongest single muscle in the body? ";
        Questions_Array[5] = "What is Latin for seize the day? ";
        Questions_Array[6] = "Who wrote the Illiad and the Odyssey? ";
        Questions_Array[7] = "Afrikaans was developed from which European language? ";
        Questions_Array[8] = "What is the Periodic Table symbol for Gold?";
        Questions_Array[9] = "Where in the USA would you find, La Guardia, JFK and Newark airports?";
    }

    public String getQuestion(int number){

        return Questions_Array[number];

    }

    public int number = 0;
    int[] array = new int[10];                                                                       //Create an empty array of length 5

    public void QuestionRandomiser (int number){

        number = (int) (Math.random() * 10);                                                        //Variable is given a random value from 0 to 5

        if (Questions_Array[number] == null){

            number = (int) (Math.random() * 10);

        }
        else {
            getQuestion(number);                                                                    //The value becomes the index of the QuestionsArray, and gets the question
            Questions_Array[number] = null;                                                         //Element at the given index becomes null
        }

    }

}
