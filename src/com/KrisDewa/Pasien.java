package com.KrisDewa;

public class Pasien {
    private int nik, umur;
    private String nama, jk, alamat, penyakit, status;

    //CONSTRUCTOR PASIEN
    public Pasien(int nik, String nama, int umur, String jk, String alamat, String penyakit, String status) {
        this.nik = nik;
        this.nama = nama;
        this.umur = umur;
        this.jk = jk;
        this.alamat = alamat;
        this.penyakit = penyakit;
        this.status = status;
    }
    //GETTER AND SETTER
    public int getNik() {
        return nik;
    }
    public void setNik(int nik) {
        this.nik = nik;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    public String getJk() {
        return jk;
    }
    public void setJk(String jk) {
        this.jk = jk;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getPenyakit() {
        return penyakit;
    }
    public void setPenyakit(String penyakit) {
        this.penyakit = penyakit;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}

