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

import static am.app.CreatePlayer.player2;
import static am.app.QuestionScreen2.players;

public class QuestionsOrder2 extends AppCompatActivity {

    public TextView question;
    public static int randomNumber;
    public TextView Aa;
    public TextView Bb;
    public TextView Cc;
    public TextView playerNumber;
    public TextView scoreview;
    public int randomA;
    public int randomB;
    public int randomC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions_order2);
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

        RadioButton A = (RadioButton) findViewById(R.id.Aa2);
        RadioButton B = (RadioButton) findViewById(R.id.Bb2);
        RadioButton C = (RadioButton) findViewById(R.id.Cc2);
        playerNumber = (TextView) findViewById(R.id.textView14);
        scoreview = (TextView) findViewById(R.id.textView21);


        randomNumber = (int)(Math.random()*10);

        //checks which player is answering the question
        if (players % 2 == 0) {
            //Tells who is playing
            playerNumber.setText(CreatePlayer.player1.getName());
            //Displays the score for player 1
            scoreview.setText(String.valueOf(CreatePlayer.player1.getScore()));
        } else {
            //Tells who is playing
            playerNumber.setText(CreatePlayer.player2.getName());
            //Displays the score for player 2
            scoreview.setText(String.valueOf(CreatePlayer.player2.getScore()));
        }

        while (QuestionsArray.Questions_Array[randomNumber] == "done"){
            randomNumber = ((int)(Math.random()*10));     //checks if array at random index number
        }

        QuestionsArray.Questions_Array[randomNumber] = "done";

        TextView question = (TextView) findViewById(R.id.textView13);
        question.setText(QuestionsArray.getQuestion(randomNumber));


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

    public void onRadioButtonClicked2(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        //Checks which player is playing, case for player 1
        if (players % 2 == 0) {
            // Check which radio button was clicked
            switch (view.getId()) {
                case R.id.Aa2:
                    if (checked) {
                        if (randomA == 0) {
                            //case 0 in Answer Randomiser is always the correct answer, so if button A was checked and A displays the correct answer, the goToCorrect method will be called
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

                case R.id.Bb2:
                    if (checked) {
                        if (randomB == 0) {
                            //case 0 in Answer Randomiser is always the correct answer, so if button A was checked and A displays the correct answer, the goToCorrect method will be called
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
                case R.id.Cc2:
                    if (checked) {
                        if (randomC == 0) {
                            //case 0 in Answer Randomiser is always the correct answer, so if button A was checked and A displays the correct answer, the goToCorrect method will be called
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
            //Checks which button was selected
            switch (view.getId()) {
                case R.id.Aa2:
                    if (checked) {
                        if (randomA == 0) {
                            //case 0 in Answer Randomiser is always the correct answer, so if button A was checked and A displays the correct answer, the goToCorrect method will be called
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

                case R.id.Bb2:
                    if (checked) {
                        if (randomB == 0) {
                            //case 0 in Answer Randomiser is always the correct answer, so if button A was checked and A displays the correct answer, the goToCorrect method will be called
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
                case R.id.Cc2:
                    if (checked) {
                        if (randomC == 0) {
                            //case 0 in Answer Randomiser is always the correct answer, so if button A was checked and A displays the correct answer, the goToCorrect method will be called
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

    public void goToCheatSelect(View v){
        players = players+1;
        Intent intent = new Intent(this, SelectCheat.class);
        startActivity(intent);
    }

    public void goToSkipSelect(View v){
        players = players+1;
        Intent intent = new Intent(this, SelectQuestions.class);
        startActivity(intent);
    }
}

