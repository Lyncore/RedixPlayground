package com.example.prof_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreenActivity extends AppCompatActivity {
//Класс для реализации SplashScreen
//Дата создания 25.03.2024
//Автор Александрова Дарина
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        //Показ SplashScreen
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);

                if(!prefs.getBoolean("completed", false)) {
                    startActivity(new Intent(SplashScreenActivity.this, FirstScreenActivity.class));
                } else {
                    startActivity(new Intent(SplashScreenActivity.this, ThirdScreenActivity.class));
                }
            }
        }, 2000);
    }
}