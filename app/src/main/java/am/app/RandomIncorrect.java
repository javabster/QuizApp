package am.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

//Class for incorrect answers in random mode

public class RandomIncorrect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_incorrect);
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

    public void goToNextQuestion(View view){

        //If all questions have been done, it goes to the final score screen
        if ((QuestionsArray.Questions_Array[0] == "done") && (QuestionsArray.Questions_Array[1] == "done") &&
                (QuestionsArray.Questions_Array[2] == "done") && (QuestionsArray.Questions_Array[3] == "done")
                && (QuestionsArray.Questions_Array[4] == "done") && (QuestionsArray.Questions_Array[5] == "done") &&
                (QuestionsArray.Questions_Array[6] == "done") && (QuestionsArray.Questions_Array[7] == "done")
                && (QuestionsArray.Questions_Array[8] == "done") && (QuestionsArray.Questions_Array[9] == "done")){
            Intent intent = new Intent(this, FinalScore.class); //goes to final score
            startActivity(intent);
        }

        //If not all questions have been done, goes back to random questions mode
        else if(NameInput2Players.twoPlayerMode==true){ //for 2 player mode
            Intent intent = new Intent(this, QuestionsOrder2.class);
            startActivity(intent);
        }

        else { //for 1 player mode
            Intent intent = new Intent(this, QuestionsOrder.class);
            startActivity(intent);
        }
    }

}
