package am.app;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

//Class for initial page

public class MainActivity extends FragmentActivity implements BlankFragment.OnFragmentInteractionListener { //adds fragment to main activity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //default player created
        CreatePlayer.defaultPlayer.setName("null");
        CreatePlayer.defaultPlayer.setScore(0);

        //when no players have been added the high scores array will only show default player values
        if (FinalScore.playerAdded != true)
            HighScoreArray.arraySetValues();

        //enables the select question buttons to reappear if a new game is startes
        SelectQuestions.question1attempt = false;
        SelectQuestions.question2attempt = false;
        SelectQuestions.question3attempt = false;
        SelectQuestions.question4attempt = false;
        SelectQuestions.question5attempt = false;
        SelectQuestions.question6attempt = false;
        SelectQuestions.question7attempt = false;
        SelectQuestions.question8attempt = false;
        SelectQuestions.question9attempt = false;
        SelectQuestions.question10attempt = false;


        //2 player mode is false until Players method run
        NameInput2Players.twoPlayerMode = false;

        //used to differentiate between selct questions mode and random questions mode later on
        SelectQuestionScreen.select = false;

        //resets question array values to questions, rather than "done" once random method has been used at last once
        QuestionsArray.Enter_String_Name();


    }

    public void Players(View v){ //Goes to Players, user chooses to play the game
        Intent intent = new Intent(this, Players.class);
        startActivity(intent);
    }

    public void HighScores(View v){ //Goes to HighScores, user chooses to see the high scores
        Intent intent = new Intent(this, HighScores.class);
        startActivity(intent);
    }

    //enables interaction with fragment, is blank because our fragment only displays text
    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
