package me.athallah.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();


        final RadioGroup grupPert_1 = findViewById(R.id.grupPert_1);
        final RadioGroup grupPert_2 = findViewById(R.id.grupPert_2);
        final RadioGroup grupPert_3 = findViewById(R.id.grupPert_3);
        final RadioGroup grupPert_4 = findViewById(R.id.grupPert_4);
        final RadioGroup grupPert_5 = findViewById(R.id.grupPert_5);
        final RadioGroup grupPert_6 = findViewById(R.id.grupPert_6);
        final RadioGroup grupPert_7 = findViewById(R.id.grupPert_7);
        final RadioGroup grupPert_8 = findViewById(R.id.grupPert_8);
        final RadioGroup grupPert_9 = findViewById(R.id.grupPert_9);
        final RadioGroup grupPert_10 = findViewById(R.id.grupPert_10);

        AtomicInteger score = new AtomicInteger();

        Button btSubmit = findViewById(R.id.btn_jawab);

        btSubmit.setOnClickListener(view -> {
            int id1 = grupPert_1.getCheckedRadioButtonId();
            int id2 = grupPert_2.getCheckedRadioButtonId();
            int id3 = grupPert_3.getCheckedRadioButtonId();
            int id4 = grupPert_4.getCheckedRadioButtonId();
            int id5 = grupPert_5.getCheckedRadioButtonId();
            int id6 = grupPert_6.getCheckedRadioButtonId();
            int id7 = grupPert_7.getCheckedRadioButtonId();
            int id8 = grupPert_8.getCheckedRadioButtonId();
            int id9 = grupPert_9.getCheckedRadioButtonId();
            int id10 = grupPert_10.getCheckedRadioButtonId();


            if (id1 == R.id.jwb_1_3) {
                score.addAndGet(10);
            }
            if (id2 == R.id.jwb_2_1) {
                score.addAndGet(10);
            }
            if (id3 == R.id.jwb_3_2) {
                score.addAndGet(10);
            }
            if (id4 == R.id.jwb_4_3) {
                score.addAndGet(10);
            }
            if (id5 == R.id.jwb_5_2) {
                score.addAndGet(10);
            }
            if (id6 == R.id.jwb_6_3) {
                score.addAndGet(10);
            }
            if (id7 == R.id.jwb_7_1) {
                score.addAndGet(10);
            }
            if (id8 == R.id.jwb_8_2) {
                score.addAndGet(10);
            }
            if (id9 == R.id.jwb_9_2) {
                score.addAndGet(10);
            }
            if (id10 == R.id.jwb_10_3) {
                score.addAndGet(10);
            }

            Intent i = new Intent(MainActivity.this, ScoreActivity.class);
            i.putExtra("skor", score);
            startActivity(i);
            finish();
        });

    }
}