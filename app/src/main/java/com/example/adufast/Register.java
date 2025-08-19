package com.example.adufast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    private EditText editTextName, editTextEmail, editTextPassword;
    private Button buttonRegister;
    private TextView LoginLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Hubungkan variabel dengan elemen di XML
        editTextName = findViewById(R.id.editTextName);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonRegister = findViewById(R.id.buttonRegister);
        LoginLink = findViewById(R.id.LoginLink);

        // Aksi tombol register
        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString().trim();
                String email = editTextEmail.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();

                if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(Register.this, "Harap isi semua field!", Toast.LENGTH_SHORT).show();
                } else {
                    // Di sini bisa ditambahkan logika simpan data / API register
                    Toast.makeText(Register.this, "Registrasi Berhasil!", Toast.LENGTH_SHORT).show();

                    // Contoh: pindah ke halaman login setelah register
                    Intent intent = new Intent(Register.this, Home.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

        // Aksi ketika link login diklik
        LoginLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Register.this, Login.class);
                startActivity(intent);
                finish();
            }
        });
    }
}