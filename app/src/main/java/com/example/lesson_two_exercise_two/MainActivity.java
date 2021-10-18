package com.example.lesson_two_exercise_two;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int roomtemperature = 29;

        if (roomtemperature < 18) {
            Log.d("myLog", "Cold, turn on the heat!");
        } else if (roomtemperature > 28) {
            Log.d("myLog", "Hot, turn off the heat!");
        } else {
            Log.d("myLog","Comfortable temperature.");
        }
    }
}