package am.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class CheatPage extends AppCompatActivity {

    public TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_cheat);
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

        if (SelectQuestionScreen.select == true){
        TextView answer = (TextView) findViewById(R.id.cheat_answer);
        answer.setText(AnswerRandomiser.getAnswer(SelectQuestions.number, 0));}

        else if (NameInput2Players.twoPlayerMode == true){
            TextView answer = (TextView) findViewById(R.id.cheat_answer);
            answer.setText(AnswerRandomiser.getAnswer(QuestionsOrder2.randomNumber, 0));
        }
        else{
            TextView answer = (TextView) findViewById(R.id.cheat_answer);
            answer.setText(AnswerRandomiser.getAnswer(QuestionsOrder.randomNumber, 0));
        }

    }


    public void goToNext(View v){

        if (SelectQuestionScreen.select == true && NameInput2Players.twoPlayerMode != true){
            Intent intent = new Intent(this, SelectQuestions.class);
            startActivity(intent);
        }
        else if (SelectQuestionScreen.select != true && NameInput2Players.twoPlayerMode == true){
            Intent intent = new Intent(this, QuestionsOrder2.class);
            startActivity(intent);
        }
        else if (SelectQuestionScreen.select != true && NameInput2Players.twoPlayerMode != true){
            Intent intent = new Intent(this, QuestionsOrder.class);
            startActivity(intent);
        }
        else if (SelectQuestionScreen.select == true && NameInput2Players.twoPlayerMode == true){
            Intent intent = new Intent(this, SelectQuestions.class);
            startActivity(intent);}
    }

}
