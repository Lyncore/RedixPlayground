package com.example.prof_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.prof_project.databinding.ActivityHomeBinding;
import com.example.prof_project.utils.BaseActivity;

//Класс для реализации экрана Home
//Дата создания 27.03.2024
//Автор Александрова Дарина
public class HomeActivity extends BaseActivity<ActivityHomeBinding> {

    NavController navController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        navController = Navigation.findNavController(this, R.id.main_nav_host);
        navController.setGraph(R.navigation.mobile_navigation);

        NavigationUI.setupWithNavController(binding.mainNav, navController);
    }

    @Override
    protected ActivityHomeBinding binding() {
        return ActivityHomeBinding.inflate(this.getLayoutInflater());
    }
}