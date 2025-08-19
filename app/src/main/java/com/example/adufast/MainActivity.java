package com.example.adufast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Pengaturan Splashscreen
        Thread thread = new Thread() {
            public void run() {
                try {
                    sleep(3000); // Tunggu 3 detik
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    // Pindah ke MainActivity (login activity)
                    startActivity(new Intent(MainActivity.this, Login.class));
                    finish(); // Tutup SplashScreen agar tidak bisa kembali dengan tombol Back
                }
            }
        };
        thread.start();
    }
}