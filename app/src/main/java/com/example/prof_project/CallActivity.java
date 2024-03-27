package com.example.prof_project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

//Класс для реализации звонка доставщику
//Дата создания 27.03.2024
//Автор Александрова Дарина
public class CallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView stop_button = findViewById(R.id.stop_call_button);

        //Обработка нажатия на кнопку зввершения вызова, переход на вкладку чата с доставщиком
        stop_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ChatRiderActivity.class);
                finish();
                startActivity(intent);
            }
        });
    }
}