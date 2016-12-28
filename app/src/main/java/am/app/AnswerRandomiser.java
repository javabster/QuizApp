package am.app;

/**
 * Created by abbymitchell on 10/12/2016.
 */


//Class randomly assigns each answer button with one of the possible answers for each question

public class AnswerRandomiser {


    public static String getAnswer(int randomnumber, int randomnumberX) {
        switch (randomnumber) {
            //Each case refers to a question (i.e. 0 for question 1; 1 for question 2; etc...)
            case 0:
                switch (randomnumberX) {
                    case 0:
                        return "Blue Whale";

                    case 1:
                        return "African Elephant";
                    //break;
                    case 2:
                        return "Hippopotamus";
                    //break;
                }
                //break;
            case 1:
                switch (randomnumberX) {
                    case 0:
                        return "1989";
                    //break;
                    case 1:
                        return "1990";
                    //break;
                    case 2:
                        return "1991";
                    //break;
                }
                //break;

            case 2:
                switch (randomnumberX) {
                    case 0:
                        return "Ottawa";
                    //break;
                    case 1:
                        return "Toronto";
                    //break;
                    case 2:
                        return "Vancouver";
                    //break;
                }
                //break;

            case 3:
                switch (randomnumberX) {
                    case 0:
                        return "Vatican City";
                    //break;
                    case 1:
                        return "Monaco";
                    //break;
                    case 2:
                        return "Tuvalu";
                    //break;
                }
                //break;

            case 4:
                switch (randomnumberX) {
                    case 0:
                        return "1066";
                    //break;
                    case 1:
                        return "1312";
                    //break;
                    case 2:
                        return "1865";
                    //break;
                }
                //break;

            case 5:
                switch (randomnumberX) {
                    case 0:
                        return "carpe diem";
                    //break;
                    case 1:
                        return "a bene placito";
                    //break;
                    case 2:
                        return "in harmonia progressio";
                    //break;
                }
                //break;

            case 6:
                switch (randomnumberX) {
                    case 0:
                        return "Homer";
                    //break;
                    case 1:
                        return "Aristotle";
                    //break;
                    case 2:
                        return "Ulysses";
                    //break;
                }
                //break;

            case 7:
                switch (randomnumberX) {
                    case 0:
                        return "Dutch";
                    //break;
                    case 1:
                        return "German";
                    //break;
                    case 2:
                        return "Danish";
                    //break;
                }
                //break;

            case 8:
                switch (randomnumberX) {
                    case 0:
                        return "Au";
                    //break;
                    case 1:
                        return "Gd";
                    //break;
                    case 2:
                        return "Ag";
                    //break;
                }
                //break;

            case 9:
                switch (randomnumberX) {
                    case 0:
                        return "Grey";
                    //break;
                    case 1:
                        return "Pink";
                    //break;
                    case 2:
                        return "Blue";
                    //break;
                }

                //default: break;
                //break;}
                return "blah";
        }
     return "blahblah";}
}



