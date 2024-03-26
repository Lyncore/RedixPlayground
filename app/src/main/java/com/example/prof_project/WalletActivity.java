package com.example.prof_project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
//Класс для реализации экрана wallet
//Дата создания 26.03.2024
//Автор Александрова Дарина
public class WalletActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallet);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView button_profile = findViewById(R.id.button_profile);
        ImageView button_track = findViewById(R.id.button_track);

        //Обработка нажатия на иконку профиля в нижнем меню и переход в профиль
        button_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
                finish();
                startActivity(intent);
            }
        });

        //Обработка нажатия на иконку машины в нижнем меню и переход во вкладку Track
        button_track.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TrackActivity.class);
                finish();
                startActivity(intent);
            }
        });
    }
}