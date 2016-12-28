package am.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

//Class for cheat answers

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

        if (SelectQuestionScreen.select == true){ //Cheat for Select Questions Mode
        TextView answer = (TextView) findViewById(R.id.cheat_answer);
        answer.setText(AnswerRandomiser.getAnswer(SelectQuestions.number, 0));} //Displays answer

        else if (NameInput2Players.twoPlayerMode == true){ //Random Questions multiplayer
            TextView answer = (TextView) findViewById(R.id.cheat_answer);
            answer.setText(AnswerRandomiser.getAnswer(QuestionsOrder2.randomNumber, 0));
        }
        else{
            TextView answer = (TextView) findViewById(R.id.cheat_answer); //Random Questions 1 player
            answer.setText(AnswerRandomiser.getAnswer(QuestionsOrder.randomNumber, 0));
        }

    }

    //Goes to next question, depending on if a)one or two player and b)if it is select questions or random questions
    public void goToNext(View v){

        if (SelectQuestionScreen.select == true && NameInput2Players.twoPlayerMode != true){ //multiplayer
            Intent intent = new Intent(this, SelectQuestions.class); //Goes to Select Questions activity
            startActivity(intent);
        }
        else if (SelectQuestionScreen.select != true && NameInput2Players.twoPlayerMode == true){ //multiplayer
            Intent intent = new Intent(this, QuestionsOrder2.class); //Random Question mode
            startActivity(intent);
        }
        else if (SelectQuestionScreen.select != true && NameInput2Players.twoPlayerMode != true){ //1 player
            Intent intent = new Intent(this, QuestionsOrder.class); //Random Question mode
            startActivity(intent);
        }
        else if (SelectQuestionScreen.select == true && NameInput2Players.twoPlayerMode == true){ //1 player
            Intent intent = new Intent(this, SelectQuestions.class); //Goes to Select Questions activity
            startActivity(intent);}
    }

}
