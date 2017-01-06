package am.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class SFinalScore extends AppCompatActivity {

    private static String TAG = "etc";
    public TextView finalScore;
    public TextView finalScore2;
    public static boolean playerAdded;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_score);
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

        Log.d(TAG, "arrived at score screen");
        playerAdded = true;

        if (SelectQuestions.scores2player==true){
            CreatePlayer.player1.scoreToHighScorePlayer1();
            CreatePlayer.player2.scoreToHighScorePlayer2();
            finalScore = (TextView) findViewById(R.id.finalscore);
            finalScore.setText(CreatePlayer.player1.getName() + "-" + CreatePlayer.player1.scoreToString() + "\n" +
                    CreatePlayer.player2.getName() + "-" + CreatePlayer.player2.scoreToString());
            //finalScore.setVisibility(View.INVISIBLE);
        }
        else{
            CreatePlayer.player.scoreToHighScore();
            finalScore = (TextView) findViewById(R.id.finalscore);
            finalScore.setText(CreatePlayer.player.scoreToString());
            //finalScore2.setVisibility(View.INVISIBLE);
        }




    }

    public void goToHomePage(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}
