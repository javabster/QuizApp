package am.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import static am.app.CreatePlayer.player2;
import static am.app.QuestionScreen2.players;

//Class for random questions in 2 player mode

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

    private static final String TAG = "RandomQuestionScreen2";

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

        Log.d(TAG, "On(Create) bundle called");

        RadioButton A = (RadioButton) findViewById(R.id.Aa2R);
        RadioButton B = (RadioButton) findViewById(R.id.Bb2R);
        RadioButton C = (RadioButton) findViewById(R.id.Cc2R);
        playerNumber = (TextView) findViewById(R.id.textView14);
        scoreview = (TextView) findViewById(R.id.textView21);
        SelectQuestions.scores2player = true; //used to display 2 players scores on FinalScore page


        randomNumber = (int)(Math.random()*10);

        Log.d(TAG, "random number generated");

        //checks which player is answering the question
        // If the number is even, then player 1 is playing
        if (players % 2 == 0) {
            //Tells who is playing
            playerNumber.setText(CreatePlayer.player1.getName());
            //Displays the score for player 1
            scoreview.setText(String.valueOf(CreatePlayer.player1.getScore()));
        } else { //players variable is odd, player 2 is playing
            //Tells who is playing
            playerNumber.setText(CreatePlayer.player2.getName());
            //Displays the score for player 2
            scoreview.setText(String.valueOf(CreatePlayer.player2.getScore()));
        }

        Log.d(TAG, "Player name and score set");

        while (QuestionsArray.Questions_Array[randomNumber] == "done"){
            randomNumber = ((int)(Math.random()*10));     //checks if array at random index number
        }

        QuestionsArray.Questions_Array[randomNumber] = "done";

        Log.d(TAG, "Questions_Array value set to done");

        TextView question = (TextView) findViewById(R.id.textView13);
        question.setText(QuestionsArray.getQuestion(randomNumber));


        randomA = (int) (Math.random() * 3); //Assigns random number to randomA
        randomB = (int) (Math.random() * 3); //Assigns random number to randomB

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
                case R.id.Aa2R:
                    if (checked) {
                        if (randomA == 0) {
                            /*case 0 in Answer Randomiser is always the correct answer,
                            so if button A was checked and A displays the correct answer,
                            the goToCorrect method will be called*/
                            CreatePlayer.player1.addScore(1);//Adds 1 to the score
                            players = players+1; //Adds 1 to the players variable, so that next question, player 2 plays
                            Intent intentNext = new Intent(this, RandomCorrect.class);
                            startActivity(intentNext);
                        } else {
                            players = players+1;
                            Intent intentNext = new Intent(this, RandomIncorrect.class);
                            startActivity(intentNext);
                        }
                    }
                    break;

                case R.id.Bb2R:
                    if (checked) {
                        if (randomB == 0) {
                            CreatePlayer.player1.addScore(1);
                            players = players+1;
                            Intent intentNext = new Intent(this, RandomCorrect.class);
                            startActivity(intentNext);
                        } else {
                            players = players+1;
                            Intent intentNext = new Intent(this, RandomIncorrect.class);
                            startActivity(intentNext);
                        }
                    }

                    break;
                case R.id.Cc2R:
                    if (checked) {
                        if (randomC == 0) {
                            CreatePlayer.player1.addScore(1);
                            players = players+1;
                            Intent intentNext = new Intent(this, RandomCorrect.class);
                            startActivity(intentNext);
                        } else {
                            players = players+1;
                            Intent intentNext = new Intent(this, RandomIncorrect.class);
                            startActivity(intentNext);
                        }
                        break;
                    }
            }
        } else { //for player 2
            switch (view.getId()) {
                case R.id.Aa2R:
                    if (checked) {
                        if (randomA == 0) {
                            player2.addScore(1);
                            players = players+1;
                            Intent intentNext = new Intent(this, RandomCorrect.class);
                            startActivity(intentNext);
                        } else {
                            players = players+1;
                            Intent intentNext = new Intent(this, RandomIncorrect.class);
                            startActivity(intentNext);
                        }
                    }
                    break;

                case R.id.Bb2R:
                    if (checked) {
                        if (randomB == 0) {
                            player2.addScore(1);
                            players = players+1;
                            Intent intentNext = new Intent(this, RandomCorrect.class);
                            startActivity(intentNext);
                        } else {
                            players = players+1;
                            Intent intentNext = new Intent(this, RandomIncorrect.class);
                            startActivity(intentNext);
                        }
                    }

                    break;
                case R.id.Cc2R:
                    if (checked) {
                        if (randomC == 0) {
                            player2.addScore(1);
                            players = players+1;
                            Intent intentNext = new Intent(this, RandomCorrect.class);
                            startActivity(intentNext);
                        } else {
                            players = players+1;
                            Intent intentNext = new Intent(this, RandomIncorrect.class);
                            startActivity(intentNext);
                        }
                        break;
                    }
            }
        }

    }

    //Goes to cheat
    public void goToCheatRandom(View v){
        players = players+1; //Adds 1 to the players variable, so that next question, player 2 plays
        Intent intent = new Intent(this, CheatPage.class);
        startActivity(intent);
    }

    //If the question is skipped
    public void goToSkipRandom(View v){
        players = players+1; //Adds 1 to the players variable, so that next question, player 2 plays
        Intent intent = new Intent(this, QuestionsOrder2.class); //repeats what was done in this class
        startActivity(intent);
    }
}

