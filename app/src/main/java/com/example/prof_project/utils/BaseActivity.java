package com.example.prof_project.utils;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewbinding.ViewBinding;

public abstract class BaseActivity <Binding extends ViewBinding>  extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = binding();
        setContentView(binding.getRoot());
    }

    protected Binding binding;
    protected abstract Binding binding();
}
