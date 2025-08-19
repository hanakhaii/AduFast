package com.example.adufast;

public class AduanModel {
    private String subjek;
    private String deskripsi;
    private String status;
    private int fotoResId; // kalau dari resource drawable

    public AduanModel(String subjek, String deskripsi, String status, int fotoResId) {
        this.subjek = subjek;
        this.deskripsi = deskripsi;
        this.status = status;
        this.fotoResId = fotoResId;
    }

    public String getSubjek() { return subjek; }
    public String getDeskripsi() { return deskripsi; }
    public String getStatus() { return status; }
    public int getFotoResId() { return fotoResId; }
}
