package am.app;

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
    Button cheatButton = (Button) findViewById(R.id.CheatButton);
    Button skipButton = (Button) findViewById(R.id.SkipButton);
    RadioButton A = (RadioButton) findViewById(R.id.radiobuttonA);
    RadioButton B = (RadioButton) findViewById(R.id.radiobuttonB);
    RadioButton C = (RadioButton) findViewById(R.id.radiobuttonC);
    int randA, randB, randC;

    public void displayQuestion(View view){

        //variable number from SelectQuestions will be used as the index of the array and display the questions
        switch(number){

            case 0:
                textview.setText(Questions_Array[number]); //displays question 1 after the player has chosen it.
                randA = (int) Math.random()*3;
                randB = (int) Math.random()*3;
                while (randB == randA){
                    randB = (int) Math.random()*3;
                }
                randC = (int) Math.random()*3;
                while (randC == randA || randC ==randB){
                    randC = (int) Math.random()*3;
                }


                A.setText(AnswerRandomiser.getAnswer(number, randA));
                B.setText("randomAnswer again");
                C.setText("randomAnswer again again");




        }
    }

} //hello Matei
