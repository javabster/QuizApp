package am.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class RandomCorrect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_correct);
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

    public void goToNextQuestion(View view){ //sends user to next randomised question

        if ((QuestionsArray.Questions_Array[0] == "done") && (QuestionsArray.Questions_Array[1] == "done") &&
                (QuestionsArray.Questions_Array[2] == "done") && (QuestionsArray.Questions_Array[3] == "done")
                && (QuestionsArray.Questions_Array[4] == "done") && (QuestionsArray.Questions_Array[5] == "done") &&
                (QuestionsArray.Questions_Array[6] == "done") && (QuestionsArray.Questions_Array[7] == "done")
                && (QuestionsArray.Questions_Array[8] == "done") && (QuestionsArray.Questions_Array[9] == "done")){
            Intent intent = new Intent(this, FinalScore.class);
            startActivity(intent);
        }

        else{
            Intent intent = new Intent(this, QuestionsOrder.class);
            startActivity(intent);}
    }

}
