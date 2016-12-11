package am.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import static am.app.QuestionsArray.Questions_Array;

public class RandomQuestion1 extends AppCompatActivity {

    public TextView question;
    public TextView A;
    public TextView B;
    public TextView C;
    public RadioButton Aa;
    public RadioButton Bb;
    public RadioButton Cc;
    public int random;
    public int randomA;
    public int randomB;
    public int randomC;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_question1);
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


        //selecting question to display:
        question = (TextView) findViewById(R.id.question);
        random = (int)(Math.random()*11);           //generates random number between 0 and 10

        while (Questions_Array[random] == null){
            random = ((int)(Math.random()*11));     //checks if array at random index number
        }

        question.setText(Questions_Array[random]);
        Questions_Array[random] = null;


        //selecting answer to display:
        A = (TextView) findViewById(R.id.A);
        randomA = ((int)(Math.random()*3));    // generates random number between 0 and 2
        A.setText(AnswerRandomiser.getAnswer(random, randomA)); // returns string stored in switch statement in AnswerRandomiser

        B = (TextView) findViewById(R.id.B);
        randomB = ((int)(Math.random()*3));    // generates random number between 0 and 2
        B.setText(AnswerRandomiser.getAnswer(random, randomB)); // returns string stored in switch statement in AnswerRandomiser

        C = (TextView) findViewById(R.id.C);
        randomB = ((int)(Math.random()*3));    // generates random number between 0 and 2
        C.setText(AnswerRandomiser.getAnswer(random, randomC)); // returns string stored in switch statement in AnswerRandomiser

        Aa = (RadioButton) findViewById(R.id.Aa);
        Bb = (RadioButton) findViewById(R.id.Bb);
        Cc = (RadioButton) findViewById(R.id.Cc);

    }



    public void onRadioButtonClicked(View view){       // code obtained from: https://developer.android.com/guide/topics/ui/controls/radiobutton.html
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.Aa:
                if (checked){
                    if (randomA == 0)  //case 0 in Answer Randomiser is always the correct answer, so if button A was checked and A displays the correct answer, the goToCorrect method will be called
                        goToCorrect();
                    else goToIncorrect();}
                break;
            case R.id.Bb:
                if (checked){
                    if (randomB == 0)
                        goToCorrect();
                    else goToIncorrect();}
                    break;
            case R.id.Cc:
                if (checked){
                    if (randomC == 0)
                        goToCorrect();
                    else goToIncorrect();}
                break;

    }


    public void goToCorrect(){                //sends user to page saying they are correct
        CreatePlayer.player.addScore(1);
        Intent intent = new Intent(this, RandomCorrect);
        startActivity(intent);

    }



    public void goToIncorrect() { //sends user to page saying they are incorrect
        Intent intent = new Intent(this, RandomIncorrect);
        startActivity(intent);
    }



    public void goToNextQuestion{           // if click skip go straight to next question
        Intent intent = new Intent(this, RandomQuestion2);
        startActivity(intent);
    }

    public void goToCheat() {// sends user to cheat page
        Intent intent = new Intent(this, RandomQuestionCheat1);
        startActivity(intent);

    }






}
