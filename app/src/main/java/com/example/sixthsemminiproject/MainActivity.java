package com.example.sixthsemminiproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
    private LinearLayout exerciseLL, stepcounterLL;
    private LottieAnimationView exerciseLAV, counterLAV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        exerciseLL = findViewById(R.id.llexercise);
        stepcounterLL = findViewById(R.id.llstepcounter);
        exerciseLAV = findViewById(R.id.lavexercise);
        counterLAV = findViewById(R.id.lavstepcounter);
        exerciseLAV.setAnimationFromUrl("https://assets6.lottiefiles.com/packages/lf20_vxnelydc.json");
        counterLAV.setAnimationFromUrl("https://assets4.lottiefiles.com/packages/lf20_mzbdc0qk.json");
        exerciseLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, exerciseactivity.class);
                startActivity(i);

            }
        });
        stepcounterLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, stepcounteractivity.class);
                startActivity(i);
            }
        });
    }
}