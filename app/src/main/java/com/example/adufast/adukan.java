package com.example.adufast;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

public class adukan extends AppCompatActivity {

    private EditText etJudulPengaduan, etDeskripsi;
    private ImageView etFoto;
    private Button btnPilihFoto, btnAdukan;
    private Uri selectedImageUri;

    private static final int REQUEST_PICK_IMAGE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adukan);

        // Inisialisasi view
        etJudulPengaduan = findViewById(R.id.etJudulPengaduan);
        etDeskripsi = findViewById(R.id.etDeskripsi);
        etFoto = findViewById(R.id.etFoto);
        btnPilihFoto = findViewById(R.id.btnPilihFoto);
        btnAdukan = findViewById(R.id.btnAdukanSekarang); // ID harus dibuat di XML

        // Event tombol pilih foto
        btnPilihFoto.setOnClickListener(v -> pilihFotoDariGaleri());

        // Event tombol Adukan
        btnAdukan.setOnClickListener(v -> kirimFormulir());
    }

    private void pilihFotoDariGaleri() {
        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        intent.setType("image/*");
        startActivityForResult(intent, REQUEST_PICK_IMAGE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_PICK_IMAGE && resultCode == Activity.RESULT_OK && data != null) {
            selectedImageUri = data.getData();
            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), selectedImageUri);
                etFoto.setImageBitmap(bitmap);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void kirimFormulir() {
        String judul = etJudulPengaduan.getText().toString().trim();
        String deskripsi = etDeskripsi.getText().toString().trim();

        if (judul.isEmpty() || deskripsi.isEmpty() || selectedImageUri == null) {
            Toast.makeText(this, "Lengkapi semua data terlebih dahulu!", Toast.LENGTH_SHORT).show();
            return;
        }

        Toast.makeText(this, "Pengaduan berhasil dikirim!", Toast.LENGTH_LONG).show();

        // Contoh kembali ke halaman utama
        finish();
    }
}