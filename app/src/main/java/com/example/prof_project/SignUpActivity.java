package com.example.prof_project;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.prof_project.databinding.ActivitySignupactivityBinding;
import com.example.prof_project.utils.BaseActivity;
import com.google.android.material.textfield.TextInputEditText;

public class SignUpActivity extends BaseActivity<ActivitySignupactivityBinding> {
    CheckBox terms;
    SignUpViewModel model;

    //Класс для реализации страницы регистрации
    //Дата создания 25.03.2024
    //Автор Александрова Дарина
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button button_signUp = (Button) findViewById(R.id.button_create_signUp);
        TextView text_signIn = findViewById(R.id.text_signIn);

        TextInputEditText nameInput = findViewById(R.id.nameInput);
        model = new ViewModelProvider(this).get(SignUpViewModel.class);
        binding.setModel(model);
        binding.setLifecycleOwner(this);

        binding.termsChk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                button_signUp.setEnabled(isChecked);
            }
        });
        //Обработка нажатия на кнопку Sign Up, переход на экран Log In
        button_signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LogInActivity.class);
                finish();
                startActivity(intent);
            }
        });
        //Обработка нажатия на текстовое поле Sign In, переход на экран Log In
        text_signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LogInActivity.class);
                finish();
                startActivity(intent);
            }
        });
    }


    @Override
    protected ActivitySignupactivityBinding binding() {
        return ActivitySignupactivityBinding.inflate(getLayoutInflater());
    }
}