package am.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void Players(View v){
        Intent intent = new Intent(this, Players.class);
        startActivity(intent);
    }

    public void HighScores(View v){
        Intent intent = new Intent(this, HighScores.class);
        startActivity(intent);
    }

}
