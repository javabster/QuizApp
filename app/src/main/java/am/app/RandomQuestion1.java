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
    public static int random;
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
        random = (int)(Math.random()*10);           //generates random number between 0 and 10

        //checks if Questions array is empty (mneaning quiz finished) and if so calls goToScore method
        if ((Questions_Array[0] == null) && (Questions_Array[1] == null) && (Questions_Array[2] == null) && (Questions_Array[3] == null)
                && (Questions_Array[4] == null) && (Questions_Array[5] == null) && (Questions_Array[6] == null) && (Questions_Array[7] == null)
                && (Questions_Array[8] == null) && (Questions_Array[9] == null)){
            Intent intent = new Intent(this, FinalScore.class);
            startActivity(intent);
        }
            ;

        //checks if array place is filled
        while (Questions_Array[random] == null){
            random = ((int)(Math.random()*10));     //checks if array at random index number
        }

        question.setText(Questions_Array[random]);  //sets activity question to array value of randomly generated number
        Questions_Array[random] = null;            // once question has been used sets empties that array value


        //selecting answer to display:
        A = (TextView) findViewById(R.id.A);
        randomA = ((int)(Math.random()*3));    // generates random number between 0 and 2
        A.setText(AnswerRandomiser.getAnswer(random, randomA)); // returns string stored in switch statement in AnswerRandomiser

        B = (TextView) findViewById(R.id.B);
        randomB = ((int)(Math.random()*3));    // generates random number between 0 and 2
        while (randomB == randomA)
            randomB = ((int)(Math.random()*3)); // checks 
        B.setText(AnswerRandomiser.getAnswer(random, randomB)); // returns string stored in switch statement in AnswerRandomiser

        C = (TextView) findViewById(R.id.C);
        randomC = ((int)(Math.random()*3));    // generates random number between 0 and 2
        while (randomC == randomA || randomC == randomB)
            randomC = ((int)(Math.random()*3));
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
                    if (randomA == 0){  //case 0 in Answer Randomiser is always the correct answer, so if button A was checked and A displays the correct answer, the goToCorrect method will be calle
                        CreatePlayer.player.addScore(1);
                        Intent intent = new Intent(this, RandomCorrect.class);
                        startActivity(intent);}
                    else {Intent intent = new Intent(this, RandomCorrect.class);
                    startActivity(intent);}}
                break;
            case R.id.Bb:
                if (checked) {
                    if (randomB == 0) {
                        CreatePlayer.player.addScore(1);
                        Intent intent = new Intent(this, RandomCorrect.class);
                        startActivity(intent);
                    } else {
                        Intent intent = new Intent(this, RandomCorrect.class);
                        startActivity(intent);
                    }}
                    break;
                    case R.id.Cc:
                        if (checked) {
                            if (randomC == 0) {
                                CreatePlayer.player.addScore(1);
                                Intent intent = new Intent(this, RandomCorrect.class);
                                startActivity(intent);
                            } else {
                                Intent intent = new Intent(this, RandomCorrect.class);
                                startActivity(intent);
                            }
                            break;
                        }
                }

    }




    public void goToNextQuestion(View v){           // if click skip go straight to next question
        Intent intent = new Intent(this, RandomQuestion1.class);
        startActivity(intent);
    }

    public void goToCheat(View v) {// sends user to cheat page
        Intent intent = new Intent(this, RandomQuestionCheat.class);
        startActivity(intent);

    }


}







