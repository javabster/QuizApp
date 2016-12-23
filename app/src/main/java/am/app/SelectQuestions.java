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
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Button;

import static am.app.CreatePlayer.player;
import static am.app.CreatePlayer.player1;
import static am.app.CreatePlayer.player2;
import static am.app.QuestionsArray.Questions_Array;
import static android.R.attr.contentDescription;
import static android.R.attr.value;

public class SelectQuestions extends AppCompatActivity {
    private static String TAG = "SelectQuestions1";
    public static int number;

    public static boolean question1attempt;
    public static boolean question2attempt;
    public static boolean question3attempt;
    public static boolean question4attempt;
    public static boolean question5attempt;
    public static boolean question6attempt;
    public static boolean question7attempt;
    public static boolean question8attempt;
    public static boolean question9attempt;
    public static boolean question10attempt;


    public Button button1;
    public Button button2;
    public Button button3;
    public Button button4;
    public Button button5;
    public Button button6;
    public Button button7;
    public Button button8;
    public Button button9;
    public Button button10;
    public ViewGroup SelectQuestionLayout;

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


        button1 = (Button) findViewById(R.id.button4);
        button2 = (Button) findViewById(R.id.button5);
        button3 = (Button) findViewById(R.id.button6);
        button4 = (Button) findViewById(R.id.button8);
        button5 = (Button) findViewById(R.id.button9);
        button6 = (Button) findViewById(R.id.button10);
        button7 = (Button) findViewById(R.id.button11);
        button8 = (Button) findViewById(R.id.button12);
        button9 = (Button) findViewById(R.id.button13);
        button10 = (Button) findViewById(R.id.button14);

        if (question1attempt == true)
            button1.setVisibility(View.INVISIBLE);  //if question 1 has already been attempted, deletes button

        if (question2attempt == true)
            button2.setVisibility(View.INVISIBLE);

        if (question3attempt == true)
            button3.setVisibility(View.INVISIBLE);

        if (question4attempt == true)
            button4.setVisibility(View.INVISIBLE);

        if (question5attempt == true)
            button5.setVisibility(View.INVISIBLE);

        if (question6attempt == true)
            button6.setVisibility(View.INVISIBLE);

        if (question7attempt == true)
            button7.setVisibility(View.INVISIBLE);

        if (question8attempt == true)
            button8.setVisibility(View.INVISIBLE);

        if (question9attempt == true)
            button9.setVisibility(View.INVISIBLE);

        if (question10attempt == true)
            button10.setVisibility(View.INVISIBLE);




    }


    public void SelectQuestion1(View v){
        Log.d(TAG, "select q1 method called");
        number = 0;
        question1attempt=true;
        //Checks if the two players in multiplayer mode have names (i.e. exist); same in each method
        if (NameInput2Players.twoPlayerMode == true) {
            Intent intent2 = new Intent(this, QuestionScreen2.class); //Goes to multiplayer mode
            startActivity(intent2);
        }
        //Checks if the individual player has a name (i.e. exists); same in each method
        else {
            Intent intent = new Intent(this, SelectQuestionScreen.class);//Goes to single player mode
            startActivity(intent);
        }
    }

    public void SelectQuestion2(View v){
        number = 1;
        question2attempt=true;

        if (NameInput2Players.twoPlayerMode == true) {
            Intent intent2 = new Intent(this, QuestionScreen2.class); //Goes to multiplayer mode
            startActivity(intent2);
        }
        else {
            Intent intent = new Intent(this, SelectQuestionScreen.class);
            startActivity(intent);
        }
    }

    public void SelectQuestion3(View v){
        number = 2;
        question3attempt=true;

        if (NameInput2Players.twoPlayerMode == true) {
            Intent intent2 = new Intent(this, QuestionScreen2.class); //Goes to multiplayer mode
            startActivity(intent2);
        }
        else {
            Intent intent = new Intent(this, SelectQuestionScreen.class);
            startActivity(intent);
        }
    }
    public void SelectQuestion4(View v){
        number = 3;
        question4attempt=true;

        if (NameInput2Players.twoPlayerMode == true) {
            Intent intent2 = new Intent(this, QuestionScreen2.class); //Goes to multiplayer mode
            startActivity(intent2);
        }
        else {
            Intent intent = new Intent(this, SelectQuestionScreen.class);
            startActivity(intent);
        }
    }
    public void SelectQuestion5(View v){
        number = 4;
        question5attempt=true;

        if (NameInput2Players.twoPlayerMode == true) {
            Intent intent2 = new Intent(this, QuestionScreen2.class); //Goes to multiplayer mode
            startActivity(intent2);
        }
        else {
            Intent intent = new Intent(this, SelectQuestionScreen.class);
            startActivity(intent);
        }
    }
    public void SelectQuestion6(View v){
        number = 5;
        question6attempt=true;

        if (NameInput2Players.twoPlayerMode == true) {
            Intent intent2 = new Intent(this, QuestionScreen2.class); //Goes to multiplayer mode
            startActivity(intent2);
        }
        else {
            Intent intent = new Intent(this, SelectQuestionScreen.class);
            startActivity(intent);
        }
    }
    public void SelectQuestion7(View v){
        number = 6;
        question7attempt=true;

        if (NameInput2Players.twoPlayerMode == true) {
            Intent intent2 = new Intent(this, QuestionScreen2.class); //Goes to multiplayer mode
            startActivity(intent2);
        }
        else {
            Intent intent = new Intent(this, SelectQuestionScreen.class);
            startActivity(intent);
        }
    }
    public void SelectQuestion8(View v){
        number = 7;
        question8attempt=true;

        if (NameInput2Players.twoPlayerMode == true) {
            Intent intent2 = new Intent(this, QuestionScreen2.class); //Goes to multiplayer mode
            startActivity(intent2);
        }
        else {
            Intent intent = new Intent(this, SelectQuestionScreen.class);
            startActivity(intent);
        }
    }
    public void SelectQuestion9(View v){
        number = 8;
        question9attempt=true;

        if (NameInput2Players.twoPlayerMode == true) {
            Intent intent2 = new Intent(this, QuestionScreen2.class); //Goes to multiplayer mode
            startActivity(intent2);
        }
        else {
            Intent intent = new Intent(this, SelectQuestionScreen.class);
            startActivity(intent);
        }
    }
    public void SelectQuestion10(View v){
        number = 9;
        question10attempt=true;

        if (NameInput2Players.twoPlayerMode == true) {
            Intent intent2 = new Intent(this, QuestionScreen2.class); //Goes to multiplayer mode
            startActivity(intent2);
        }
        else {
            Intent intent = new Intent(this, SelectQuestionScreen.class);
            startActivity(intent);
        }
    }

    public void GoToScore(View v){
        Intent intent = new Intent (this, FinalScore.class);
        startActivity(intent);
    }

}
