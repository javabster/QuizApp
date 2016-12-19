package am.app;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class HighScores extends AppCompatActivity {

    public TextView highscores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_scores);
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
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //HighScoreArray.sort((Comparable[]) HighScoreArray.High_Scores);
        highscores = (TextView) findViewById(R.id.HighScores);
        //highscores.setText(CreatePlayer.player.highScoreToString());
        highscores.setText("1  " + HighScoreArray.High_Scores[0] + "\n2:  " + HighScoreArray.High_Scores[1]
         + "\n3:  " + HighScoreArray.High_Scores[2] + "\n4:  " + HighScoreArray.High_Scores[3] + "\n5:  " + HighScoreArray.High_Scores[4]
        + "\n6:  " + HighScoreArray.High_Scores[5] + "\n7:  " + HighScoreArray.High_Scores[6] + "\n8:  " + HighScoreArray.High_Scores[7]
        + "\n9:  " + HighScoreArray.High_Scores[8] +"\n10: " + HighScoreArray.High_Scores[9]);


    }

}
