package me.athallah.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class ScoreActivity extends AppCompatActivity {

    TextView scoretx;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        Objects.requireNonNull(getSupportActionBar()).hide();

        scoretx = findViewById(R.id.score1);
        int skor = Integer.parseInt(getIntent().getExtras().get("skor").toString());
        scoretx.setText(String.format("%s%%", skor));

        Button tryagain = findViewById(R.id.buttoncoba);
        tryagain.setOnClickListener(View -> {
            Intent i = new Intent(ScoreActivity.this, me.athallah.quizapp.MainActivity.class);
            startActivity(i);
            finish();
        });
    }
}