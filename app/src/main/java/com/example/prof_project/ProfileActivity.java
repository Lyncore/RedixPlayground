package com.example.prof_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;

import com.google.android.material.switchmaterial.SwitchMaterial;

//Класс для реализации экрана профиля
//Дата создания 26.03.2024
//Автор Александрова Дарина
public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        SwitchMaterial switch_to_dark = findViewById(R.id.swith_to_dark);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView card = findViewById(R.id.card);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView button_wallet = findViewById(R.id.button_wallet);
        ImageView button_track = findViewById(R.id.button_track);
        //Обработка нажатия на переключатель, переход в темную тему и обратно
        switch_to_dark.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                }
                else{
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                }
            }
        });

        //Переход на страницу выбора способа оплаты
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AddPayementActivity.class);
                finish();
                startActivity(intent);
            }
        });

        //Переход на страницу Wallet
        button_wallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WalletActivity.class);
                finish();
                startActivity(intent);
            }
        });
        //Переход на страницу Wallet
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