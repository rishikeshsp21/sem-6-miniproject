package com.example.sixthsemminiproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.airbnb.lottie.LottieAnimationView;

import java.util.ArrayList;

public class exerciservadapter extends RecyclerView.Adapter<exerciservadapter.exerciseviewholder> {
    private ArrayList<exerciservmodel> exerciservmodelArrayList;
    private Context context;
    private ExerciseClickInterface exerciseClickInterface;

    public exerciservadapter(ArrayList<exerciservmodel> exerciservmodelArrayList, Context context, ExerciseClickInterface exerciseClickInterface) {
        this.exerciservmodelArrayList = exerciservmodelArrayList;
        this.context = context;
        this.exerciseClickInterface = exerciseClickInterface;
    }

    @NonNull
    @Override
    public exerciservadapter.exerciseviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.exercise_rv_item, parent, false);
        return new exerciseviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull exerciservadapter.exerciseviewholder holder, int position) {
        holder.exercisetv.setText(exerciservmodelArrayList.get(position).getExercisename());
        holder.exerciselav.setAnimationFromUrl(exerciservmodelArrayList.get(position).getImgurl());
        String time = String.valueOf(exerciservmodelArrayList.get(position).getTime())  + " Minutes";
        holder.timetv.setText(time);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exerciseClickInterface.OnExerciseClick(holder.getAdapterPosition());
            }
        });
    }

    @Override
    public int getItemCount() {
        return exerciservmodelArrayList.size();
    }

    public class exerciseviewholder extends RecyclerView.ViewHolder{
        private TextView exercisetv, timetv;
        private LottieAnimationView exerciselav;
        public exerciseviewholder(@NonNull View itemView) {
            super(itemView);
            exercisetv = itemView.findViewById(R.id.idtvexercisename);
            timetv = itemView.findViewById(R.id.idtvexercisetime);
            exerciselav = itemView.findViewById(R.id.idexerciselav);
         }
    }
    public interface ExerciseClickInterface{
        void OnExerciseClick(int position);
    }
}
