package am.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import static am.app.NameInput2Players.twoPlayerMode;

/*Class for QuestionMethod activity,
where the user chooses between random questions,
or the option to select the questions*/

public class QuestionMethod extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_method);
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

    //For random questions
    public void RandomQuestions(View v){
        if (NameInput2Players.twoPlayerMode == true) { //For 2 player mode
            Intent intent = new Intent(this, QuestionsOrder2.class);
            startActivity(intent);
        }
        else{ //for this statement, twoPlayerMode == false, so it is for 1 player
            Intent intent = new Intent(this, QuestionsOrder.class);
            startActivity(intent);
        }
    }

    /*For selecting questions
    * In this case, regardless of the number of players,
    * the user is sent to the SelectQuestions activity*/
    public void SelectQuestions(View v){
        Intent intent = new Intent(this, SelectQuestions.class);
        startActivity(intent);
    }

}
