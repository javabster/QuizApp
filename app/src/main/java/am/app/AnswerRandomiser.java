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

                    case 2:
                        return "Hippopotamus";

                }

            case 1:
                switch (randomnumberX) {
                    case 0:
                        return "1989";

                    case 1:
                        return "1990";

                    case 2:
                        return "1991";

                }


            case 2:
                switch (randomnumberX) {
                    case 0:
                        return "Ottawa";

                    case 1:
                        return "Toronto";

                    case 2:
                        return "Vancouver";

                }


            case 3:
                switch (randomnumberX) {
                    case 0:
                        return "Vatican City";

                    case 1:
                        return "Monaco";

                    case 2:
                        return "Tuvalu";

                }

            case 4:
                switch (randomnumberX) {
                    case 0:
                        return "1066";

                    case 1:
                        return "1312";

                    case 2:
                        return "1865";

                }


            case 5:
                switch (randomnumberX) {
                    case 0:
                        return "carpe diem";

                    case 1:
                        return "a bene placito";

                    case 2:
                        return "in harmonia progressio";

                }


            case 6:
                switch (randomnumberX) {
                    case 0:
                        return "Homer";

                    case 1:
                        return "Aristotle";

                    case 2:
                        return "Ulysses";

                }


            case 7:
                switch (randomnumberX) {
                    case 0:
                        return "Dutch";

                    case 1:
                        return "German";

                    case 2:
                        return "Danish";

                }


            case 8:
                switch (randomnumberX) {
                    case 0:
                        return "Au";

                    case 1:
                        return "Gd";

                    case 2:
                        return "Ag";

                }


            case 9:
                switch (randomnumberX) {
                    case 0:
                        return "Grey";

                    case 1:
                        return "Pink";

                    case 2:
                        return "Blue";

                }

                return "blah"; //in case inner switch cases don't run
        }
     return "blahblah";} //in case outer switch cases don't run
}



