package com.example.adufast;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    private LinearLayout infoterkini, adukan, peraturan, laporananda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Hubungkan ID layout
        infoterkini = findViewById(R.id.infoterkini);
        adukan = findViewById(R.id.adukan);
        peraturan = findViewById(R.id.peraturan);
        laporananda = findViewById(R.id.laporananda);

        // Event klik masing-masing kotak
        infoterkini.setOnClickListener(v -> showMessage("Info Terkini"));
        adukan.setOnClickListener(v -> showMessage("Adukan!"));
        peraturan.setOnClickListener(v -> showMessage("Peraturan"));
        laporananda.setOnClickListener(v -> showMessage("Laporan Anda"));
    }

    private void showMessage(String menu) {
        Intent intent;

        if (menu.equals("Info Terkini")) {
            intent = new Intent(Home.this, info.class);
        } else if (menu.equals("Adukan!")) {
            intent = new Intent(Home.this, adukan.class);
        } else if (menu.equals("Peraturan")) {
            intent = new Intent(Home.this, panduanAduan.class);
        } else if (menu.equals("Laporan Anda")) {
            intent = new Intent(Home.this, ListAduanAnda.class);
        } else {
            return; // kalau menu tidak dikenal, hentikan
        }

        startActivity(intent);
    }
}