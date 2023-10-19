package com.example.sixthsemminiproject;

public class exerciservmodel {
    private String exercisename;
    private String exercisedesc;
    private String imgurl;
    private int calories, time;

    public String getExercisename() {
        return exercisename;
    }

    public void setExercisename(String exercisename) {
        this.exercisename = exercisename;
    }

    public String getExercisedesc() {
        return exercisedesc;
    }

    public void setExercisedesc(String exercisedesc) {
        this.exercisedesc = exercisedesc;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public exerciservmodel(String exercisename, String exercisedesc, String imgurl, int calories, int time) {
        this.exercisename = exercisename;
        this.exercisedesc = exercisedesc;
        this.imgurl = imgurl;
        this.calories = calories;
        this.time = time;
    }
}
