package com.example.prof_project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

//Класс для экрана добавления способа оплаты
//Дата создания 26.03.2024
//Автор Александрова Дарина
public class AddPayementActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_payement);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView button_back = (ImageView) findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
                finish();
                startActivity(intent);
            }
        });
    }
}