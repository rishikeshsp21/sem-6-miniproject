package com.example.sixthsemminiproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class ExerciseDetailActivity extends AppCompatActivity {
    private TextView exerciseNameTV,caloriesTV, timeTV, descTV;
    private LottieAnimationView exerciseLAV;
    private String exerciseName, desc, imgUrl;
    private int calories, time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_detail);
        exerciseNameTV = findViewById(R.id.idTVExerciseName);
        caloriesTV = findViewById(R.id.idTVCalories);
        timeTV = findViewById(R.id.idTVTime);
        descTV = findViewById(R.id.idTVDesc);
        exerciseLAV = findViewById(R.id.idExerciseLAV);
        exerciseName = getIntent().getStringExtra("exercisename");
        imgUrl = getIntent().getStringExtra("ImgUrl");
        desc = getIntent().getStringExtra("desc");
        calories = getIntent().getIntExtra("calories", 0);
        time = getIntent().getIntExtra("Time", 0);
        exerciseNameTV.setText(exerciseName);
        caloriesTV.setText("Calories: " + calories);
        timeTV.setText("time: " + time + "minutes");
        descTV.setText(desc);
        exerciseLAV.setAnimationFromUrl(imgUrl);
    }
}