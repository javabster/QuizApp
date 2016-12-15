package am.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

//Transition class and screen so that the players know whose turn it is
public class TransitionScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition_screen);
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

    TextView textview = (TextView) (findViewById(R.id.textView10));
    public static int players = 0;

    public void transitionScreen(View v){
        //Checks which player it is so that they know whose turn it is
        if (players % 2 == 0){
            textview.setText("Player 1");
            players = players + 1; // adds 1 so that next turn, player 2 will come up on the screen
        }
        else{
            textview.setText("Player 2");
            players = players + 1;
        }
        //takes you to the question screen
        Intent intent = new Intent (this, QuestionScreen2.class);
        startActivity(intent);
    }

}
