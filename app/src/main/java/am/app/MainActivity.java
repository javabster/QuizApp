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
