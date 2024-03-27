package com.example.prof_project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

//Класс для реализации экрана Home
//Дата создания 27.03.2024
//Автор Александрова Дарина
public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageButton button_chats = findViewById(R.id.button_chats);
        ImageView button_wallet = findViewById(R.id.button_wallet);
        ImageView button_track = findViewById(R.id.button_track);
        //Обработка нажатия на кнопку чатов, переход на вкладку Чаты
        button_chats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ChatsActivity.class);
                startActivity(intent);
            }
        });

        //Обработка нажатия на иконку кошелька в нижнем меню, переход на вкладку Wallet
        button_wallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WalletActivity.class);
                finish();
                startActivity(intent);
            }
        });

        //Обработка нажатия на иконку машинкы в нижнем меню, переход на вкладку Track
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