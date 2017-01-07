package am.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

//Class for setting the name of the players in multiplayer mode

public class NameInput2Players extends AppCompatActivity {


    public static String Name1;
    public static String Name2;
    public static boolean twoPlayerMode = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_input2_players);
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


    public void SelectQuestionMethod2(View v) {
        EditText NameInput1 = (EditText) findViewById(R.id.Player1Name);
        EditText NameInput2 = (EditText) findViewById(R.id.Player2Name);
        Name1 = NameInput1.getText().toString(); //Name1 becomes the name typed by user
        Name2 = NameInput2.getText().toString(); //Name2 becomes name typed by user

        CreatePlayer.player1.setName(Name1); //sets name for player 1
        CreatePlayer.player1.setScore(0); //assigns an initial score of 0
        CreatePlayer.player2.setName(Name2); //sets name for player 2
        CreatePlayer.player2.setScore(0); //assigns an initial score of 0
        twoPlayerMode=true; //boolean variable becomes true since this is in two player mode
        Intent intent = new Intent(this, QuestionMethod.class); //Sends the players to the question method screen
        startActivity(intent);
    }
}
