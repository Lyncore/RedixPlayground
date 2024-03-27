package com.example.prof_project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LogInActivity extends AppCompatActivity {
    //Класс для реализации возможности входа в аккаунт
    //Дата создания 25.03.2024
    //Автор Александрова Дарина
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button button_logIn = (Button) findViewById(R.id.button_logIn);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView text_signUp = (TextView) findViewById(R.id.text_signUp);
        TextView text_forgot_password = (TextView) findViewById(R.id.button_forgot_password);
        //Обработка нажатия на кнопку Log In, переход на экран Home
        button_logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LogInActivity.this, HomeActivity.class);
                finish();
                startActivity(intent);
            }
        });
        //Обработка нажатия на текстовое поле Sign Up, переход на экран Sign Up
        text_signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SignUpActivity.class);
                finish();
                startActivity(intent);
            }
        });
        //Обработка нажатия на текстовое поле Forgot Password, переход на экран Forgot Password
        text_forgot_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ForgotRasswordActivity.class);
                finish();
                startActivity(intent);
            }
        });
    }
}