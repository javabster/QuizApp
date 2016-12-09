package am.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import static am.app.QuestionsArray.Questions_Array;

public class RandomQuestion1 extends AppCompatActivity {

    public String question;
    public int random;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_question1);
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

        question = (TextView) findViewById(R.id.question);
        random = (int)(Math.random()*10+1);           //generates random number between 0 and 10

        while (Questions_Array[random] == null){
            random = ((int)(Math.random()*10+1));     //checks if array at random index number
        }

        question.setText(Questions_Array[random]);
        Questions_Array[random] = null;

    }


    public void goToCorrect(){                //sends user to page saying they are correct
        CreatePlayer.player.addScore(1);
        Intent intent = new Intent(this, Q1RandomCorrect);
        startActivity(intent);

    }



    public void goToIncorrect(){} //sends user to page saying they are incorrect



    public void goToQ2{} // if click skip go straight to next question

    public void goToCheat(){} // sends user to cheat page






}
