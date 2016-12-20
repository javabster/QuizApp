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

public class FinalScore extends AppCompatActivity {

    private static String TAG = "etc";
    public TextView finalScore;
    public static boolean playerAdded;

    private SharedPreferences HSc;
    public static final String H_SC = "High Score";

    private SharedPreferences prefs;


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
        /*HSc = getSharedPreferences(H_SC, 0);
        SharedPreferences.Editor scoreEdit = HSc.edit();
        String scores = HSc.getString("HighScores", "");
        scoreEdit.putString("HighScores", ""+CreatePlayer.player.name+" - "+CreatePlayer.player.score);
        scoreEdit.commit();
        SharedPreferences prefs = this.getSharedPreferences("myPrefsKey", Context.MODE_PRIVATE);*/

        /*SharedPreferences mPrefs = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor prefsEditor = mPrefs.edit();
        Gson gson = new Gson();
        String json = gson.toJson(CreatePlayer.player); // myObject - instance of MyObject
        prefsEditor.putString("MyObject", json);
        prefsEditor.commit();*/


        finalScore = (TextView) findViewById(R.id.finalscore);
        finalScore.setText(CreatePlayer.player.scoreToString());


        playerAdded = true;
        CreatePlayer.player.scoreToHighScore();




    }

    public void goToHomePage(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}
