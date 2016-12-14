package am.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import static am.app.QuestionsArray.Questions_Array;
import static android.R.attr.contentDescription;

public class SelectQuestions extends AppCompatActivity {
    private static String TAG = "SelectQuestions1";
    public static int number;

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


    public void SelectQuestion1(View v){
        Log.d(TAG, "method called");
        number = 0;
        //view.setVisibility(View.GONE);                                                  //Deletes button
        Intent intent = new Intent(this, SelectQuestionScreen.class);
        startActivity(intent);
    }

    public void SelectQuestion2(View v){
        number = 1;
        //view.setVisibility(View.GONE);                                                  //Deletes button
        Intent intent = new Intent(this, SelectQuestionScreen.class);
        startActivity(intent);
    }

    public void SelectQuestion3(View v){
        number = 2;
        //view.setVisibility(View.GONE);                                                  //Deletes button
        Intent intent = new Intent(this, SelectQuestionScreen.class);
        startActivity(intent);
    }
    public void SelectQuestion4(View v){
        number = 3;
        //view.setVisibility(View.GONE);                                                  //Deletes button
        Intent intent = new Intent(this, SelectQuestionScreen.class);
        startActivity(intent);
    }
    public void SelectQuestion5(View v){
        number = 4;
        //view.setVisibility(View.GONE);                                                  //Deletes button
        Intent intent = new Intent(this, SelectQuestionScreen.class);
        startActivity(intent);
    }
    public void SelectQuestion6(View v){
        number = 5;
        //view.setVisibility(View.GONE);                                                  //Deletes button
        Intent intent = new Intent(this, SelectQuestionScreen.class);
        startActivity(intent);
    }
    public void SelectQuestion7(View v){
        number = 6;
        //view.setVisibility(View.GONE);                                                  //Deletes button
        Intent intent = new Intent(this, SelectQuestionScreen.class);
        startActivity(intent);
    }
    public void SelectQuestion8(View v){
        number = 7;
        //view.setVisibility(View.GONE);                                                  //Deletes button
        Intent intent = new Intent(this, SelectQuestionScreen.class);
        startActivity(intent);
    }
    public void SelectQuestion9(View v){
        number = 8;
        //view.setVisibility(View.GONE);                                                  //Deletes button
        Intent intent = new Intent(this, SelectQuestionScreen.class);
        startActivity(intent);
    }
    public void SelectQuestion10(View v){
        number = 9;
        //view.setVisibility(View.GONE);                                                  //Deletes button
        Intent intent = new Intent(this, SelectQuestionScreen.class);
        startActivity(intent);
    }

    public void GoToScore(View v){
        Intent intent = new Intent (this, FinalScore.class);
        startActivity(intent);
    }




   /* public void SelectQuestion(View view){                                                          //Creates method so that the player can select a question

        Qnumber = (int) contentDescription;
        Log.e("tag", Integer.toString(Qnumber));

            switch(Qnumber){                                                             //Each button has a content description with an integer value

                case 1:
                    number = 0;
                    //view.setVisibility(View.GONE);                                                  //Deletes button
                    Intent intent = new Intent(this, SelectQuestionScreen.class);
                    startActivity(intent);
                    break;

                case 2:
                    number = 1;
                    //view.setVisibility(View.GONE);
                    Intent intent2 = new Intent(this, SelectQuestionScreen.class);
                    startActivity(intent2);
                    break;

                case 3:
                    number = 2;
                    //view.setVisibility(View.GONE);
                    Intent intent3 = new Intent(this, SelectQuestionScreen.class);
                    startActivity(intent3);
                    break;

                case 4:
                    number = 3;
                    //view.setVisibility(View.GONE);
                    Intent intent4 = new Intent(this, SelectQuestionScreen.class);
                    startActivity(intent4);
                    break;

                case 5:
                    number = 4;
                    //view.setVisibility(View.GONE);
                    Intent intent5 = new Intent(this, SelectQuestionScreen.class);
                    startActivity(intent5);
                    break;

                case 6:
                    number = 5;
                    //view.setVisibility(View.GONE);
                    Intent intent6 = new Intent(this, SelectQuestionScreen.class);
                    startActivity(intent6);
                    break;

                case 7:
                    number = 6;
                    //view.setVisibility(View.GONE);
                    Intent intent7 = new Intent(this, SelectQuestionScreen.class);
                    startActivity(intent7);
                    break;

                case 8:
                    number = 7;
                    //view.setVisibility(View.GONE);
                    Intent intent8 = new Intent(this, SelectQuestionScreen.class);
                    startActivity(intent8);
                    break;

                case 9:
                    number = 8;
                    //view.setVisibility(View.GONE);
                    Intent intent9 = new Intent(this, SelectQuestionScreen.class);
                    startActivity(intent9);
                    break;

                case 10:
                    number = 9;
                    //view.setVisibility(View.GONE);
                    Intent intent10 = new Intent(this, SelectQuestionScreen.class);
                    startActivity(intent10);
                    break;

                case 11:
                    Intent intentFinal = new Intent(this, HighScores.class);
                    startActivity(intentFinal);
                    break;

                default:
                    Intent intent12 = new Intent(this, MainActivity.class);
                    startActivity(intent12);
                    break;
        }*/

}
