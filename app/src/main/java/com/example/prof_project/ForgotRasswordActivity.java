package com.example.prof_project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ForgotRasswordActivity extends AppCompatActivity {
    //Класс для реализации возможности восстановления пароля
    //Дата создания 25.03.2024
    //Автор Александрова Дарина
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_rassword);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView text_signIn = (TextView) findViewById(R.id.text_forgot_signIn);
        //Обработка нажатия на текст Sign In, переход на экран Log In
        text_signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LogInActivity.class);
                finish();
                startActivity(intent);
            }
        });
    }
}