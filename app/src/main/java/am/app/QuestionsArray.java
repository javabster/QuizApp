package am.app;

/**
 * Created by mateiborc on 08/12/2016.
 */

public class QuestionsArray {

    //Creates a array of strings containing the questions, used for randomly generated questions section
    public static String[] Questions_Array = new String[10];

    public static void Enter_String_Name(){
        //Each question has an index, each string will be changed to "null" once the question has been attempted
        Questions_Array[0] = "What is the largest mammal on Earth? ";
        Questions_Array[1] = "In what year did the Berlin Wall fall? ";
        Questions_Array[2] = "What is the capital of Canada? ";
        Questions_Array[3] = "What is the smallest country in the world? ";
        Questions_Array[4] = "When was the battle of Hastings? ";
        Questions_Array[5] = "What is Latin for seize the day? ";
        Questions_Array[6] = "Who wrote the Illiad and the Odyssey? ";
        Questions_Array[7] = "Afrikaans was developed from which European language? ";
        Questions_Array[8] = "What is the Periodic Table symbol for Gold?";
        Questions_Array[9] = "What colour is the Jubilee line on the London Underground?";
    }



    public static String getQuestion(int numberv){
        //switch statement for displaying questions on any activity that uses them
        switch (numberv){
            case 0:
                return "What is the largest mammal on Earth?";
            case 1:
                return "In what year did the Berlin Wall fall?";
            case 2:
                return "What is the capital of Canada?";
            case 3:
                return "What is the smallest country in the world?";
            case 4:
                return "When was the battle of Hastings?";
            case 5:
                return "What is Latin for seize the day?";
            case 6:
                return "Who wrote the Illiad and the Odyssey?";
            case 7:
                return "Afrikaans was developed from which European language?";
            case 8:
                return "What is the Periodic Table symbol for Gold?";
            case 9:
                return "What colour is the Jubilee line on the London Underground?";
            default: return "blah";

        }
    }

        }



