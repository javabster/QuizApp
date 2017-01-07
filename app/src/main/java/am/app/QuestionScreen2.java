package am.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import static am.app.CreatePlayer.player2;
import static am.app.SelectQuestions.number;

/*Question screen for 2 players mode.
Allows the scores to be that of either p1 or p2,
and also keeps count of the scores each one individually*/

public class QuestionScreen2 extends AppCompatActivity {

    private static String TAG = "QuestionScreen2";
    int randA, randB, randC;
    public TextView question;
    //Helps differentiate if it's player 1 or player 2, will be used throughout the game
    public static int players = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_screen2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        // Each object on the screen is assigned to a variable which is to be used in the method

        TextView scoreview = (TextView) findViewById(R.id.Score2);
        RadioButton A = (RadioButton) findViewById(R.id.radioButtonA2);
        RadioButton B = (RadioButton) findViewById(R.id.radioButtonB2);
        RadioButton C = (RadioButton) findViewById(R.id.radioButtonC2);
        TextView playerNumber = (TextView) findViewById(R.id.PlayerNumber);

        Log.d(TAG, "QuestionScreen2 reached");
        TextView question = (TextView) findViewById(R.id.textView16);
        question.setText(QuestionsArray.getQuestion(number)); //displays question n after the player has chosen it.
        Log.d(TAG, "Question selected");

        //checks which player is answering the question
        //If the number is even, then it is player 1
        if (players % 2 == 0) {
            //Tells who is playing
            playerNumber.setText(CreatePlayer.player1.getName());
            //Displays the score for player 1
            scoreview.setText(String.valueOf(CreatePlayer.player1.getScore()));
        } else { //If the number is odd, player 2 is playing
            //Tells who is playing
            playerNumber.setText(CreatePlayer.player2.getName());
            //Displays the score for player 2
            scoreview.setText(String.valueOf(CreatePlayer.player2.getScore()));
        }

        Log.d(TAG, "first if else statement done");

        randA = (int) (Math.random() * 3); //Assigns random number to randA
        randB = (int) (Math.random() * 3); //Assigns random number to randB

        //Checks numbers are not the same
        while (randB == randA) {
            randB = (int) (Math.random() * 3);
        }
        randC = (int) (Math.random() * 3);

        //Checks numbers are not the same
        while (randC == randA || randC == randB) {
            randC = (int) (Math.random() * 3);
        }

        //Assigns the position of each under randomly, so that the position never stays the same
        A.setText(AnswerRandomiser.getAnswer(number, randA));
        B.setText(AnswerRandomiser.getAnswer(number, randB));
        C.setText(AnswerRandomiser.getAnswer(number, randC));

        SelectQuestionScreen.select = true;


    }



    public void onRadioButtonClicked2(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        //Checks which player is playing, case for player 1
        if (players % 2 == 0) {
            // Check which radio button was clicked
            switch (view.getId()) {
                case R.id.radioButtonA2:
                    if (checked) {
                        if (randA == 0) {

                            /*case 0 in Answer Randomiser is always the correct answer,
                            so if button A was checked and A displays the correct answer,
                            the goToCorrect method will be called*/

                            CreatePlayer.player1.addScore(1); //Adds 1 to the player's score
                            players = players+1; //Adds 1 to the players variable so that it goes to the next player
                            Intent intentNext = new Intent(this, SelectCorrect.class);
                            startActivity(intentNext);
                        } else {
                            players = players+1;
                            Intent intentNext = new Intent(this, SelectIncorrect.class);
                            startActivity(intentNext);
                        }
                    }
                    break;

                case R.id.radioButtonB2:
                    if (checked) {
                        if (randB == 0) {
                            CreatePlayer.player1.addScore(1);
                            players = players+1;
                            Intent intentNext = new Intent(this, SelectCorrect.class);
                            startActivity(intentNext);
                        } else {
                            players = players+1;
                            Intent intentNext = new Intent(this, SelectIncorrect.class);
                            startActivity(intentNext);
                        }
                    }

                    break;
                case R.id.radioButtonC2:
                    if (checked) {
                        if (randC == 0) {
                            CreatePlayer.player1.addScore(1);
                            players = players+1;
                            Intent intentNext = new Intent(this, SelectCorrect.class);
                            startActivity(intentNext);
                        } else {
                            players = players+1;
                            Intent intentNext = new Intent(this, SelectIncorrect.class);
                            startActivity(intentNext);
                        }
                        break;
                    }
            }
        } else { //for player 2
            switch (view.getId()) {
                case R.id.radioButtonA2:
                    if (checked) {
                        if (randA == 0) {
                            player2.addScore(1);
                            players = players+1;
                            Intent intentNext = new Intent(this, SelectCorrect.class);
                            startActivity(intentNext);
                        } else {
                            players = players+1;
                            Intent intentNext = new Intent(this, SelectIncorrect.class);
                            startActivity(intentNext);
                        }
                    }
                    break;

                case R.id.radioButtonB2:
                    if (checked) {
                        if (randB == 0) {
                            player2.addScore(1);
                            players = players+1;
                            Intent intentNext = new Intent(this, SelectCorrect.class);
                            startActivity(intentNext);
                        } else {
                            players = players+1;
                            Intent intentNext = new Intent(this, SelectIncorrect.class);
                            startActivity(intentNext);
                        }
                    }

                    break;
                case R.id.radioButtonC2:
                    if (checked) {
                        if (randC == 0) {
                            player2.addScore(1);
                            players = players+1;
                            Intent intentNext = new Intent(this, SelectCorrect.class);
                            startActivity(intentNext);
                        } else {
                            players = players+1;
                            Intent intentNext = new Intent(this, SelectIncorrect.class);
                            startActivity(intentNext);
                        }
                        break;
                    }
            }
        }

    }

    //If cheat button was selected
    public void goToCheatSelect(View v){
        players = players+1; //So that it knows to go to the next player for the next question
        Intent intent = new Intent(this, CheatPage.class);
        startActivity(intent);
    }

    //If the skip button was selected
    public void goToSkipSelect(View v){
        players = players+1; //So that it knows to go to the next player for the next question
        Intent intent = new Intent(this, SelectQuestions.class);
        startActivity(intent);
    }

}
