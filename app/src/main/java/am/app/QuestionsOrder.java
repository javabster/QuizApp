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

import static am.app.CreatePlayer.player;

public class QuestionsOrder extends AppCompatActivity {

    public TextView question;
    public static int randomNumber;
    public TextView Aa;
    public TextView Bb;
    public TextView Cc;
    public int randomA;
    public int randomB;
    public int randomC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions_order);
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

        RadioButton A = (RadioButton) findViewById(R.id.Aa);
        RadioButton B = (RadioButton) findViewById(R.id.Bb);
        RadioButton C = (RadioButton) findViewById(R.id.Cc);


        randomNumber = (int)(Math.random()*10);

        while (QuestionsArray.Questions_Array[randomNumber] == "done"){
            randomNumber = ((int)(Math.random()*10));     //checks if array at random index number
        }

        QuestionsArray.Questions_Array[randomNumber] = "done";

        TextView question = (TextView) findViewById(R.id.question_order);
        question.setText(QuestionsArray.getQuestion(randomNumber));
        TextView scoreview = (TextView) findViewById(R.id.textView20);
        scoreview.setText(player.getScore());

        randomA = (int) (Math.random() * 3);
        randomB = (int) (Math.random() * 3);

        //Checks numbers are not the same
        while (randomB == randomA) {
            randomB = (int) (Math.random() * 3);
        }
        randomC = (int) (Math.random() * 3);

        //Checks numbers are not the same
        while (randomC == randomA || randomC == randomB) {
            randomC = (int) (Math.random() * 3);
        }

        //Assigns the position of each under randomly, so that the position never stays the same
        A.setText(AnswerRandomiser.getAnswer(randomNumber, randomA));
        B.setText(AnswerRandomiser.getAnswer(randomNumber, randomB));
        C.setText(AnswerRandomiser.getAnswer(randomNumber, randomC));


    }

    public void onRadioButtonClicked(View view){       // code obtained from: https://developer.android.com/guide/topics/ui/controls/radiobutton.html
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.Aa:
                if (checked){
                    if (randomA == 0){  //case 0 in Answer Randomiser is always the correct answer, so if button A was checked and A displays the correct answer, the goToCorrect method will be calle
                        player.addScore(1);
                        Intent intent = new Intent(this, RandomCorrect.class);
                        startActivity(intent);}
                    else {Intent intent = new Intent(this, RandomIncorrect.class);
                        startActivity(intent);}}
                break;
            case R.id.Bb:
                if (checked) {
                    if (randomB == 0) {
                        player.addScore(1);
                        Intent intent = new Intent(this, RandomCorrect.class);
                        startActivity(intent);
                    } else {
                        Intent intent = new Intent(this, RandomIncorrect.class);
                        startActivity(intent);
                    }}
                break;
            case R.id.Cc:
                if (checked) {
                    if (randomC == 0) {
                        player.addScore(1);
                        Intent intent = new Intent(this, RandomCorrect.class);
                        startActivity(intent);
                    } else {
                        Intent intent = new Intent(this, RandomIncorrect.class);
                        startActivity(intent);
                    }
                    break;
                }
        }


    }


    public void goToNextQuestion(View view){
        Intent intent = new Intent(this, QuestionsOrder.class);
        startActivity(intent);
    }

    public void goToCheat(View view){
        Intent intent = new Intent(this, RandomQuestionCheat.class);
        startActivity(intent);
    }

    public void goToScore(View view){
        Intent intent = new Intent(this, FinalScore.class);
        startActivity(intent);
    }


}
