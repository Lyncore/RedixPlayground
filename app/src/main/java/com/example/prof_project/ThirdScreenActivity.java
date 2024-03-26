package com.example.prof_project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThirdScreenActivity extends AppCompatActivity {
    //Класс для реализации третьего приветственного экрана
    //Дата создания 25.03.2024
    //Автор Александрова Дарина
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_screen);
        Button button_signUp = (Button) findViewById(R.id.button_sugnUp);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView text_signIn = (TextView) findViewById(R.id.text_signIn);
        //Обработка нажатия на кнопку Sign Up, переход на экран Holder
        button_signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SignUpActivity.class);
                finish();
                startActivity(intent);
            }
        });
        //Обработка нажатия на текстовое поле Sign In, переход на экран Holder
        text_signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SignUpActivity.class);
                finish();
                startActivity(intent);
            }
        });
    }
}