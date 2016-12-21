package am.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import static am.app.CreatePlayer.player;
import static am.app.QuestionsArray.Questions_Array;
import static am.app.SelectQuestions.number;
/*import static am.app.TransitionScreen.players;*/

/*Question screen for 2 players mode.
Allows the scores to be that of either p1 or p2,
and also keeps count of the scores each one individually*/

public class QuestionScreen2 extends AppCompatActivity {

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
    }

    // Each object on the screen is assigned to a variable which is to be used in the method
    TextView textview = (TextView) findViewById(R.id.textView3);
    TextView scoreview = (TextView) findViewById(R.id.textView5);
    Button cheatButton = (Button) findViewById(R.id.CheatButton);
    Button skipButton = (Button) findViewById(R.id.SkipButton);
    RadioButton A = (RadioButton) findViewById(R.id.radioButtonA);
    RadioButton B = (RadioButton) findViewById(R.id.radioButtonB);
    RadioButton C = (RadioButton) findViewById(R.id.radioButtonC);
    TextView playerNumber = (TextView) findViewById(R.id.PlayerNumber);
    public static int players = 0; //Helps differentiate if it's player 1 or player 2 will be used throughout the game
    int randA, randB, randC;
    //public static int=0;

    public void displayQuestion(View view) {

        textview.setText(Questions_Array[number]); //displays question 1 after the player has chosen it.

        //checks which player is answering the question
        if (players % 2 == 0) {
            //Tells who is playing
            playerNumber.setText("Player 1");
            //Displays the score for player 1
            scoreview.setText("Score: " + CreatePlayer.player1.getScore());
        } else {
            //Tells who is playing
            playerNumber.setText("Player 2");
            //Displays the score for player 2
            scoreview.setText("Score: " + CreatePlayer.player2.getScore());
        }

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


        //Checks which player is playing, case for player 1
        if (players % 2 == 0) {
            // Check which radio button was clicked
            switch (view.getId()) {
                case R.id.Aa:
                    if (checked) {
                        if (randA == 0) {
                            //case 0 in Answer Randomiser is always the correct answer, so if button A was checked and A displays the correct answer, the goToCorrect method will be called
                            CreatePlayer.player1.addScore(1);
                            Intent intentNext = new Intent(this, SelectCorrect.class);
                            startActivity(intentNext);
                        } else {
                            Intent intentNext = new Intent(this, SelectIncorrect.class);
                            startActivity(intentNext);
                        }
                    }
                    break;

                case R.id.Bb:
                    if (checked) {
                        if (randB == 0) {
                            //case 0 in Answer Randomiser is always the correct answer, so if button A was checked and A displays the correct answer, the goToCorrect method will be called
                            CreatePlayer.player1.addScore(1);
                            Intent intentNext = new Intent(this, SelectCorrect.class);
                            startActivity(intentNext);
                        } else {
                            Intent intentNext = new Intent(this, SelectIncorrect.class);
                            startActivity(intentNext);
                        }
                    }

                    break;
                case R.id.Cc:
                    if (checked) {
                        if (randA == 0) {
                            //case 0 in Answer Randomiser is always the correct answer, so if button A was checked and A displays the correct answer, the goToCorrect method will be called
                            CreatePlayer.player1.addScore(1);
                            Intent intentNext = new Intent(this, SelectCorrect.class);
                            startActivity(intentNext);
                        } else {
                            Intent intentNext = new Intent(this, SelectIncorrect.class);
                            startActivity(intentNext);
                        }
                        break;
                    }
            }
        } else { //for player 2
            //Checks which button was selected
            switch (view.getId()) {
                case R.id.Aa:
                    if (checked) {
                        if (randA == 0) {
                            //case 0 in Answer Randomiser is always the correct answer, so if button A was checked and A displays the correct answer, the goToCorrect method will be called
                            CreatePlayer.player2.addScore(1);
                            Intent intentNext = new Intent(this, SelectCorrect.class);
                            startActivity(intentNext);
                        } else {
                            Intent intentNext = new Intent(this, SelectIncorrect.class);
                            startActivity(intentNext);
                        }
                    }
                    break;

                case R.id.Bb:
                    if (checked) {
                        if (randB == 0) {
                            //case 0 in Answer Randomiser is always the correct answer, so if button A was checked and A displays the correct answer, the goToCorrect method will be called
                            CreatePlayer.player2.addScore(1);
                            Intent intentNext = new Intent(this, SelectCorrect.class);
                            startActivity(intentNext);
                        } else {
                            Intent intentNext = new Intent(this, SelectIncorrect.class);
                            startActivity(intentNext);
                        }
                    }

                    break;
                case R.id.Cc:
                    if (checked) {
                        if (randA == 0) {
                            //case 0 in Answer Randomiser is always the correct answer, so if button A was checked and A displays the correct answer, the goToCorrect method will be called
                            CreatePlayer.player2.addScore(1);
                            Intent intentNext = new Intent(this, SelectCorrect.class);
                            startActivity(intentNext);
                        } else {
                            Intent intentNext = new Intent(this, SelectIncorrect.class);
                            startActivity(intentNext);
                        }
                        break;
                    }
            }
        }

        players = players++;
    }

    public void goToCheatSelect(View v){
        Intent intent = new Intent(this, SelectCheat.class);
        startActivity(intent);
    }

    public void goToSkipSelect(View v){
        Intent intent = new Intent(this, SelectQuestions.class);
    }
}
