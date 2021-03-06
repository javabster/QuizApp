package am.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.RadioButton;

import static am.app.CreatePlayer.player;
import static am.app.SelectQuestions.number;

//Class for the select question screen in single player mode

public class SelectQuestionScreen extends AppCompatActivity {
    private static final String TAG = "SelectQuestionScreen";

    TextView textview;
    RadioButton A;
    RadioButton B;
    RadioButton C;
    int randA, randB, randC;
    public static boolean select;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_question_screen);
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

        Log.d(TAG, "arrived at 1 player select question screen");

        //Assigns a new name to each view on the content screen

        TextView textview = (TextView) findViewById(R.id.textView3);
        RadioButton A = (RadioButton) findViewById(R.id.radioButtonA);
        RadioButton B = (RadioButton) findViewById(R.id.radioButtonB);
        RadioButton C = (RadioButton) findViewById(R.id.radioButtonC);

        textview.setText(QuestionsArray.getQuestion(number)); //displays question 1 after the player has chosen it.

        randA = (int) (Math.random() * 3); //Assigns random number to randA
        randB = (int) (Math.random() * 3); //Assigns random number to randB

        TextView scoreview = (TextView) findViewById(R.id.textView5);
        scoreview.setText(String.valueOf(player.getScore())); //Displays score

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
    }


    // Each object on the screen is assigned to a variable which is to be used in the method

    public void onRadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        // Checks which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButtonA:
                if (checked){
                    if (randA == 0) {

                        /*case 0 in Answer Randomiser is always the correct answer,
                        so if button A was checked and A displays the correct answer,
                        the goToCorrect method will be called*/

                        player.addScore(1); //Adds 1 to the score if correct
                        Intent intentNext = new Intent (this, SelectCorrect.class); //Goes to the SelectCorrect screen
                        startActivity(intentNext);
                    }
                    else {
                        Intent intentNext = new Intent (this, SelectIncorrect.class); //Goes to SelectIncorrect screen
                        startActivity(intentNext);
                    }
                    }
                break;

            case R.id.radioButtonB:
                if (checked){
                if (randB == 0) {
                    player.addScore(1);
                    Intent intentNext = new Intent (this, SelectCorrect.class);
                    startActivity(intentNext);
                }
                else {
                    Intent intentNext = new Intent (this, SelectIncorrect.class);
                    startActivity(intentNext);
                }}

                break;
            case R.id.radioButtonC:
                if (checked){
                if (randC == 0) {
                    player.addScore(1);
                    Intent intentNext = new Intent (this, SelectCorrect.class);
                    startActivity(intentNext);
                }
                else {
                    Intent intentNext = new Intent (this, SelectIncorrect.class);
                    startActivity(intentNext);
                }
                break;}
        }


    }

    //Cheat method, goes to cheat page
    public void goToCheatSelect(View v){
        select = true; //Created to differentiate between select and random mode, used in cheat page
        Intent intent = new Intent(this, CheatPage.class);
        startActivity(intent);
    }

    //Skips the question, goes back to question selection page
    public void goToSkipSelect(View v){
        Intent intent = new Intent(this, SelectQuestions.class);
        startActivity(intent);
    }

}
