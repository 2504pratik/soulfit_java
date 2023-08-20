package com.example.soulfit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView icon = findViewById(R.id.iconButton);

        CardView phyCard = findViewById(R.id.phy_fit_card);
        CardView medCard = findViewById(R.id.meditation_card);
        CardView mentCard = findViewById(R.id.men_fit_card);

        icon.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ProfilePageActivity.class);
            startActivity(intent);
        });

        phyCard.setOnClickListener(view -> Toast.makeText(MainActivity.this, "Physical Fitness", Toast.LENGTH_SHORT).show());

        medCard.setOnClickListener(view -> Toast.makeText(MainActivity.this, "Meditation", Toast.LENGTH_SHORT).show());

        mentCard.setOnClickListener(view -> Toast.makeText(MainActivity.this, "Mental Fitness", Toast.LENGTH_SHORT).show());
    }
}