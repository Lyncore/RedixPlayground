package com.example.prof_project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
//Класс для реализации экрана Чатов
//Дата создания 27.03.2024
//Автор Александрова Дарина
public class ChatsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chats);
        ImageView button_back = findViewById(R.id.button_back);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView rider = findViewById(R.id.rider);

        //Обработка нажатия на кнопку назад, переход на вкладку Home
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                finish();
                startActivity(intent);
            }
        });
        //Обработка нажатия на контакт, переход в чат
        rider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ChatRiderActivity.class);
                finish();
                startActivity(intent);
            }
        });
    }
}