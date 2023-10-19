package com.example.sixthsemminiproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class exerciseactivity extends AppCompatActivity implements exerciservadapter.ExerciseClickInterface {

    private RecyclerView exerciserv;
    private ArrayList<exerciservmodel> exerciseRVModelArrayList;
    private exerciservadapter ExerciseRVadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exerciseactivity);
        exerciserv = findViewById(R.id.idrvexercise);
        exerciseRVModelArrayList = new ArrayList<>();
        ExerciseRVadapter = new exerciservadapter(exerciseRVModelArrayList, this, this::OnExerciseClick);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        exerciserv.setLayoutManager(manager);
        exerciserv.setAdapter(ExerciseRVadapter);
        addData();
    }
    private void addData()
    {
        exerciseRVModelArrayList.add(new exerciservmodel("Side Plank", getResources().getString(R.string.side_plank), "https://assets10.lottiefiles.com/packages/lf20_EOXjkv.json", 20, 10));
        exerciseRVModelArrayList.add(new exerciservmodel("Lunges", getResources().getString(R.string.lunges), "https://assets6.lottiefiles.com/packages/lf20_XbVCR4.json", 30, 10));
        exerciseRVModelArrayList.add(new exerciservmodel("High Stepping", getResources().getString(R.string.stepping), "https://assets10.lottiefiles.com/packages/lf20_igizh2.json", 40, 10));
        exerciseRVModelArrayList.add(new exerciservmodel("Crunches", getResources().getString(R.string.crunches), "https://assets5.lottiefiles.com/packages/lf20_Ajcy3F.json", 30, 20));
        exerciseRVModelArrayList.add(new exerciservmodel("Push Ups", getResources().getString(R.string.pushups), "https://assets6.lottiefiles.com/packages/lf20_psJ7Nq.json", 10, 5));
        exerciseRVModelArrayList.add(new exerciservmodel("Squats", getResources().getString(R.string.squats), "https://assets6.lottiefiles.com/packages/lf20_OFt8Hh.json", 32, 5));
        ExerciseRVadapter.notifyDataSetChanged();
    }
    @Override
    public void OnExerciseClick(int position) {
        Intent i = new Intent(exerciseactivity.this, ExerciseDetailActivity.class);
        i.putExtra("exercisename", exerciseRVModelArrayList.get(position).getExercisename());
        i.putExtra("ImgUrl", exerciseRVModelArrayList.get(position).getImgurl());
        i.putExtra("Time", exerciseRVModelArrayList.get(position).getTime());
        i.putExtra("calories", exerciseRVModelArrayList.get(position).getCalories());
        i.putExtra("desc", exerciseRVModelArrayList.get(position).getExercisedesc());
        startActivity(i);
    }
}