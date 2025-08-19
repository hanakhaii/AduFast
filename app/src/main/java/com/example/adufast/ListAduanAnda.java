package com.example.adufast;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ListAduanAnda extends AppCompatActivity {

    private ImageView etFoto;
    private TextView etSubjekPengaduan, etDeskripsi, etStatus;
    private Button btnEdit, btnDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_aduan_anda); // Ganti sesuai nama file XML-mu

        // Hubungkan dengan ID di XML
        etFoto = findViewById(R.id.etFoto);
        etSubjekPengaduan = findViewById(R.id.etSubjekPengaduan);
        etDeskripsi = findViewById(R.id.etDeskripsi);
        etStatus = findViewById(R.id.etStatus);
        btnEdit = findViewById(R.id.btnEdit);
        btnDelete = findViewById(R.id.btnDelete);

        // Contoh isi data
        etSubjekPengaduan.setText("Jalan Rusak di Jalan Merdeka");
        etDeskripsi.setText("Jalan ini rusak parah sejak 2 minggu lalu...");
        etStatus.setText("Status: Menunggu Tanggapan");
        etFoto.setImageResource(R.drawable.ic_launcher_foreground); // contoh gambar

        // Event tombol Edit
        btnEdit.setOnClickListener(v ->
                Toast.makeText(this, "Edit laporan", Toast.LENGTH_SHORT).show()
        );

        // Event tombol Hapus
        btnDelete.setOnClickListener(v ->
                Toast.makeText(this, "Hapus laporan", Toast.LENGTH_SHORT).show()
        );
    }
}