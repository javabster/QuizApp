package am.app;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;




public class MainActivity extends FragmentActivity implements BlankFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CreatePlayer.defaultPlayer.setName("null");
        CreatePlayer.defaultPlayer.setScore(0);

        if (FinalScore.playerAdded != true)
            HighScoreArray.arraySetValues();

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

        NameInput2Players.twoPlayerMode = false;

        SelectQuestionScreen.select = false;


    }

    public void Players(View v){
        Intent intent = new Intent(this, Players.class);
        startActivity(intent);
    }

    public void HighScores(View v){
        Intent intent = new Intent(this, HighScores.class);
        startActivity(intent);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
