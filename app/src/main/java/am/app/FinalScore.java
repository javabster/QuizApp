package am.app;

import android.content.Intent;
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
        finalScore = (TextView) findViewById(R.id.finalscore);
        finalScore.setText(CreatePlayer.player.scoreToString());
        //CreatePlayer.player.scoreToHighScore();
    }

    public void goToHomePage(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
