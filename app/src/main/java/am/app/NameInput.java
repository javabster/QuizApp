package am.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Scanner;

public class NameInput extends AppCompatActivity {

    //private Button GoButton;
    private EditText NameInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_input);
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

        //GoButton = (Button) findViewById(R.id.gobutton); //finding button in the other xml file
        NameInput = (EditText) findViewById(R.id.enter_name);



    }

    public void SelectQuestionMethod(View v){
        NameInput2Players.twoPlayerMode=false;
        CreatePlayer.player.setName(NameInput.getText().toString());
        Intent intent = new Intent(this, QuestionMethod.class);
        startActivity(intent);

    };



}
