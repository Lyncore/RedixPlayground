package com.example.prof_project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

//Класс для реализации экрана чата с доставщиком
//Дата создания 27.03.2024
//Автор Александрова Дарина
public class ChatRiderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_rider);
        ImageView button_back = findViewById(R.id.button_back);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView button_call = findViewById(R.id.button_call);

        //Обработка нажатия на кнопку назад, переход на вкладку Чатов
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ChatsActivity.class);
                finish();
                startActivity(intent);
            }
        });

        //Обработканажатия на иконку телефона, переход к звонку доставщику
        button_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CallActivity.class);
                finish();
                startActivity(intent);
            }
        });
    }
}