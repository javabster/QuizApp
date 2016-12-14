package am.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class NameInput2Players extends AppCompatActivity {

    private EditText NameInput1;
    private EditText NameInput2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_input2_players);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        NameInput1 = (EditText) findViewById(R.id.Player1Name);
        NameInput2 = (EditText) findViewById(R.id.Player2Name);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


    public void SelectQuestionMethod2(View v) {
        CreatePlayer.player1.setName(NameInput1.getText().toString());
        CreatePlayer.player2.setName(NameInput2.getText().toString());
        Intent intent = new Intent(this, QuestionMethod.class);
        startActivity(intent);
    }
}
