package am.app;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import static am.app.QuestionsArray.Questions_Array;
import static android.R.attr.contentDescription;

public class SelectQuestions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_questions);
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

    /* Go to activity, and create 10 buttons numbered 1-10
    Player clicks on a button
    getQuestion(button) which returns Question_Array[button]
    Use method QuestionRandomiser(button) which makes the question at index button null -
    - (since it will go to the else part of the statement)
    Delete button
    Return to screen with 1 less button */

    /*Button button = (Button) findViewById(R.id.button5);

    public void selectQuestion(View view) {

        view.setVisibility(View.GONE);
    }
}
*/
    TextView textview;
    int selector;

    public void selectQuestion(View view){

        textview = (TextView) (findViewById(R.id.button5));


    }
}





    /*public String selectQuestion(View view){                                                      //Creates method so that the player can select a question

        switch(contentDescription){                                                                 //Each button has a content description with an integer value

            case 1:

                return Questions_Array[0];                                                          //Looks at integer content and picks the question from the array
                view.setVisibility(View.GONE);                                                      //Deletes button

            case 2:

                return Questions_Array[1];
                view.setVisibility(View.GONE);

            case 3:

                return Questions_Array[2];
                view.setVisibility(View.GONE);


        }

    }

}*/
