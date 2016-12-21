package am.app;

import android.content.Intent;
import android.os.Bundle;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Players extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players);
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
    }

    public static boolean multi;

    public void Players1(View v){
        CreatePlayer.player.setScore(0);
        multi = false;
        Intent intent = new Intent(this, NameInput.class);
        startActivity(intent);

    }

    public void Players2(View v){
        CreatePlayer.player1.setScore(0);
        CreatePlayer.player2.setScore(0);
        multi = true;
        Intent intent = new Intent(this, NameInput2Players.class);
        startActivity(intent);
    }

}
