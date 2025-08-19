package com.example.adufast;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class info extends AppCompatActivity {

    private TextView news_title, news_description, news_source_date;
    private ImageView news_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        // Hubungkan view di XML ke variabel
        news_title = findViewById(R.id.news_title);
        news_description = findViewById(R.id.news_description);
        news_source_date = findViewById(R.id.news_source_date);
        news_image = findViewById(R.id.news_image);

        // Set data manual
        news_title.setText("Judul Berita 1");
        news_description.setText("Ini adalah deskripsi singkat berita pertama.");
        news_source_date.setText("Kompas | 14 Agustus 2025");
        news_image.setImageResource(R.drawable.ic_launcher_foreground); // ganti sesuai gambar kamu
    }
}