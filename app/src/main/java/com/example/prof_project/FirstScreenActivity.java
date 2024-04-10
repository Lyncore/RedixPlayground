package com.example.prof_project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class FirstScreenActivity extends AppCompatActivity {


    //Класс для реализации первого приветственного экрана
    //Дата создания 25.03.2024
    //Автор Александрова Дарина
    private Integer promoIndex = 0;
    ImageView image;
    TextView title;
    TextView desc;

    @Override
    @SuppressLint({"MissingInflatedId", "LocalSuppress"})
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);

        Button button_next = (Button) findViewById(R.id.button_next_first);
        Button button_skip = (Button) findViewById(R.id.button_skip_first);


        image = findViewById(R.id.promo_image);
        title = findViewById(R.id.promo_title);
        desc =findViewById(R.id.promo_desc);

        setPromoIndex(promoIndex);

        //Обработка нажатия на кнопку next и переход к следующему привественному экрану
        button_next.setOnClickListener(v -> {
            promoIndex++;
            if(promoIndex < PromoData.values.length) {
                setPromoIndex(promoIndex);
            }  else {
                SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);
                prefs.edit().putBoolean("completed", true).apply();

                Intent intent = new Intent(getApplicationContext(), ThirdScreenActivity.class);
                finish();
                startActivity(intent);
            }
        });

        //Обработка нажатия на кнопку skip, переход к странице holder
        button_skip.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), SignUpActivity.class);
            finish();
            startActivity(intent);
        });
    }

    private void setPromoIndex(Integer index){
        PromoData current = PromoData.values[index];
        image.setImageResource(current.imageId);
        title.setText(current.title);
        desc.setText(current.description);
    }
}