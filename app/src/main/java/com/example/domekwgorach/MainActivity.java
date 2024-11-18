package com.example.domekwgorach;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView wyswietlaczlajkow;
    private Button polub;
    private Button unlub;
    private int liczbajakow = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wyswietlaczlajkow = findViewById(R.id.liczniklajkow);
        polub = findViewById(R.id.polub);
        unlub = findViewById(R.id.unlub);

        nasluchiwaczezmianylajkow();
    }


    private void nasluchiwaczezmianylajkow() {
        polub.setOnClickListener(this::zwiekszanielajkow);
        unlub.setOnClickListener(this::zmniejszanielajkow);
    }

    private void zwiekszanielajkow(View widok) {
        liczbajakow++;
        aktualizacjalajkow();
    }

    private void zmniejszanielajkow(View widok) {
        liczbajakow = Math.max(liczbajakow - 1, 0);
        aktualizacjalajkow();
    }

    private void aktualizacjalajkow() {
        wyswietlaczlajkow.setText(liczbajakow + " polubień");
    }
}
