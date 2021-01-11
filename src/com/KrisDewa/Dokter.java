package com.KrisDewa;

public class Dokter extends Pegawai{
    private String spesialis;

    public Dokter(int id, int umur, int gaji, int jamkj, String nama, String jabatan, String spesialis) {
        super(id, umur, gaji, jamkj, nama, jabatan);
        this.spesialis = spesialis;
    }

    public String getSpesialis() {
        return spesialis;
    }
    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }
}

