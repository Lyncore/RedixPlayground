package com.example.prof_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;

import com.google.android.material.switchmaterial.SwitchMaterial;

//Класс для реализации экрана профиля
//    //Дата создания 26.03.2024
//    //Автор Александрова Дарина
public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        SwitchMaterial switch_to_dark = findViewById(R.id.swith_to_dark);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView card = findViewById(R.id.card);
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
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AddPayementActivity.class);
                startActivity(intent);
            }
        });
    }
}