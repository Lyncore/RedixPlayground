package com.example.prof_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondScreenActivity extends AppCompatActivity {
    //Класс для реализации второго приветственного экрана
    //Дата создания 25.03.2024
    //Автор Александрова Дарина
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screenactivity);
        Button button_next = (Button) findViewById(R.id.button_next_second);
        Button button_skip = (Button) findViewById(R.id.button_skip_second);
        //Обработка нажатия на кнопку next и переход к следующему привественному экрану
        button_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ThirdScreenActivity.class);
                startActivity(intent);
            }
        });
        //Обработка нажатия на кнопку skip, переход к странице holder
        button_skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Holderactivity.class);
                startActivity(intent);
            }
        });
    }
}