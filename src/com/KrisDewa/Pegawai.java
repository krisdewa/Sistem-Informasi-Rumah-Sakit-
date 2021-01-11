package com.KrisDewa;

public abstract class Pegawai {
    private int id, umur, gaji, Jamkj;
    private String nama, jabatan;

    //CONSTRUCTOR PEGAWAI
    public Pegawai(int id, int umur, int gaji, int jamkj, String nama, String jabatan) {
        this.id = id;
        this.umur = umur;
        this.gaji = gaji;
        this.Jamkj = jamkj;
        this.nama = nama;
        this.jabatan = jabatan;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    public int getGaji() {
        return gaji;
    }
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    public int getJamkj() {
        return Jamkj;
    }
    public void setJamkj(int Jamkj) {
        this.Jamkj = Jamkj;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getJabatan() {
        return jabatan;
    }
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
}

