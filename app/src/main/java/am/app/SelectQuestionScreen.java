package am.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.RadioButton;

import static am.app.QuestionsArray.Questions_Array;
import static am.app.SelectQuestions.number;

public class SelectQuestionScreen extends AppCompatActivity {

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
    }


    // Each object on the screen is assigned to a variable which is to be used in the method
    TextView textview = (TextView) findViewById(R.id.textView3);
    TextView scoreview = (TextView) findViewById(R.id.textView5);
    Button cheatButton = (Button) findViewById(R.id.CheatButton);
    Button skipButton = (Button) findViewById(R.id.SkipButton);
    RadioButton A = (RadioButton) findViewById(R.id.radioButtonA);
    RadioButton B = (RadioButton) findViewById(R.id.radioButtonB);
    RadioButton C = (RadioButton) findViewById(R.id.radioButtonC);
    int randA, randB, randC;
    //public static int=0;

    public void displayQuestion(View view) {

        textview.setText(Questions_Array[number]); //displays question 1 after the player has chosen it.
        scoreview.setText("Score: " + CreatePlayer.player.getScore());
        randA = (int) Math.random() * 3;
        randB = (int) Math.random() * 3;

        //Checks numbers are not the same
        while (randB == randA) {
            randB = (int) Math.random() * 3;
        }
        randC = (int) Math.random() * 3;

        //Checks numbers are not the same
        while (randC == randA || randC == randB) {
            randC = (int) Math.random() * 3;
        }

        //Assigns the position of each under randomly, so that the position never stays the same
        A.setText(AnswerRandomiser.getAnswer(number, randA));
        B.setText(AnswerRandomiser.getAnswer(number, randB));
        C.setText(AnswerRandomiser.getAnswer(number, randC));

    }

    public void onRadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.Aa:
                if (checked){
                    if (randA == 0) {  //case 0 in Answer Randomiser is always the correct answer, so if button A was checked and A displays the correct answer, the goToCorrect method will be called
                        CreatePlayer.player.addScore(1);
                        Intent intentNext = new Intent (this, SelectCorrect.class);
                        startActivity(intentNext);
                    }
                    else {
                        Intent intentNext = new Intent (this, SelectIncorrect.class);
                        startActivity(intentNext);
                    }
                    }
                break;

            case R.id.Bb:
                if (checked){
                if (randB == 0) {  //case 0 in Answer Randomiser is always the correct answer, so if button A was checked and A displays the correct answer, the goToCorrect method will be called
                    CreatePlayer.player.addScore(1);
                    Intent intentNext = new Intent (this, SelectCorrect.class);
                    startActivity(intentNext);
                }
                else {
                    Intent intentNext = new Intent (this, SelectIncorrect.class);
                    startActivity(intentNext);
                }}

                break;
            case R.id.Cc:
                if (checked){
                if (randA == 0) {  //case 0 in Answer Randomiser is always the correct answer, so if button A was checked and A displays the correct answer, the goToCorrect method will be called
                    CreatePlayer.player.addScore(1);
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

}
