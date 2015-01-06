package android.annesj.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questions.add(new Question("this statement is false.", "false"));
        questions.add(new Question("this statement is not true.", "true"));

        questionCount = questions.size();

        questionText = (TextView)findViewById(R.id.questionText);
        falseButton = (Button)findViewById(R.id.falseButton);
        trueButton = (Button)findViewById(R.id.trueButton);


        }
}
