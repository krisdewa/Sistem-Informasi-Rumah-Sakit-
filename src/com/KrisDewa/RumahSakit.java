package com.KrisDewa;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class RumahSakit {

    private int jumlahPasien = 0, jumlahDokter = 0, jumlahPerawat = 0, jumlahStaff =0;

    Pasien[] pasien = new Pasien[50];
    Dokter[] dokter = new Dokter[50];
    Staff[] staff = new Staff[50];
    Perawat[] perawat = new Perawat[50];

    Scanner inputan = new Scanner(System.in);

    java.io.File filePasien  = new java.io.File("LogPasien.txt");
    java.io.File fileDokter  = new java.io.File("LogDokter.txt");
    java.io.File fileStaff   = new java.io.File("LogStaff.txt");
    java.io.File filePerawat = new java.io.File("LogPerawat.txt");

    //INPUT DATA DOKTER
    public void inputDataDokter(){
        try {
            if (jumlahDokter >= dokter.length){
                throw new ArrayIndexOutOfBoundsException();
            }
            dokter[jumlahDokter] = new Dokter(1,1,1,1,"a","a","a");
            System.out.println("Anda memiliki : "+jumlahDokter+" Dokter.");
            String generateId = ("1000"+jumlahDokter);
            dokter[jumlahDokter].setId(Integer.parseInt(generateId));
            System.out.print("Masukan Nama      : "); dokter[jumlahDokter].setNama(inputan.nextLine());
            System.out.print("Masukan Jabatan   : "); dokter[jumlahDokter].setJabatan(inputan.nextLine());
            System.out.print("Masukan Spesialis : "); dokter[jumlahDokter].setSpesialis(inputan.nextLine());
            System.out.print("Masukan Umur      : "); dokter[jumlahDokter].setUmur(inputan.nextInt());
            System.out.print("Masukan Gaji      : "); dokter[jumlahDokter].setGaji(inputan.nextInt());
            System.out.print("Masukan Jam Kerja : "); dokter[jumlahDokter].setJamkj(inputan.nextInt());
            inputan.nextLine();
            jumlahDokter++;
            System.out.println("\nAnda sudah berhasil menambahkan 1 data baru dokter!");
        }
        //EXCEPTION DIJALANKAN JIKA DATA MELEBIHI KAPASITAS ARRAY DOKTER
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Data sudah melebihi kapasitas!");
        }
    }
    //PRINT DOKTER
    public void printDataDokter(){
        try{
            if (jumlahDokter <= 0){
                throw new InterruptedException();
            }
            System.out.println("========< Data Dokter >========");
            for (int i = 0; i < jumlahDokter; i++){
                System.out.println("Data "+(i+1)+" : ");
                System.out.println("\t Id        : "+dokter[i].getId());
                System.out.println("\t Nama      : "+dokter[i].getNama());
                System.out.println("\t Umur      : "+dokter[i].getUmur());
                System.out.println("\t Jabatan   : "+dokter[i].getJabatan());
                System.out.println("\t Spesialis : "+dokter[i].getSpesialis());
                System.out.println("\t Gaji      : "+dokter[i].getGaji());
                System.out.println("\t Jam/Hari  : "+dokter[i].getJamkj());
                System.out.println();
            }
        }
        //EXCEPTION DIJALANKAN JIKA DATA MASIH KOSONG
        catch (InterruptedException e){
            System.out.println("Data masih kosong! Tolong diisi terlebih dahulu.");
        }
    }
    //DATA DI RECORD, DISIMPAN DI LOG DOKTER
    public void printLogDokter() {
        try{
            if (jumlahDokter <= 0) throw new InterruptedException();
            try {
                java.io.PrintWriter output = new java.io.PrintWriter(fileDokter);
                output.println("========< Data Dokter >========");
                for (int i = 0; i < jumlahDokter; i++){
                    output.println("Data "+(i+1)+" :");
                    output.println("\t ID        : " + dokter[i].getId());
                    output.println("\t Nama      : " + dokter[i].getNama());
                    output.println("\t Umur      : " + dokter[i].getUmur());
                    output.println("\t Jabatan   : " + dokter[i].getJabatan());
                    output.println("\t Spesialis : " + dokter[i].getSpesialis());
                    output.println("\t Gaji      : " + dokter[i].getGaji());
                    output.println("\t Jam/Hari  : " + dokter[i].getJamkj());
                    output.println();
                }
                output.close();
            }
            catch (FileNotFoundException e){
                e.printStackTrace();
            }
        }
        //EXCEPTION DIJALANKAN JIKA DATA MASIH KOSONG
        catch (InterruptedException e){
            System.out.println("Data masih kosong! Jadi tidak bisa diprint out.");
        }
    }

    //INPUT PERAWAT
    public void inputDataPerawat(){
        try {
            if (jumlahPerawat >= perawat.length){
                throw new ArrayIndexOutOfBoundsException();
            }
            perawat[jumlahPerawat] = new Perawat(1,1,1,1,"a","a");
            System.out.println("Anda memiliki : "+jumlahPerawat+" Perawat.");
            String generateId = ("1000"+jumlahPerawat);
            perawat[jumlahPerawat].setId(Integer.parseInt(generateId));
            System.out.print("Masukan Nama     : ");perawat[jumlahPerawat].setNama(inputan.nextLine());
            System.out.print("Masukan Jabatan  : ");perawat[jumlahPerawat].setJabatan(inputan.nextLine());
            System.out.print("Masukan Umur     : ");perawat[jumlahPerawat].setUmur(inputan.nextInt());
            System.out.print("Masukan Gaji     : ");perawat[jumlahPerawat].setGaji(inputan.nextInt());
            System.out.print("Masukan Jam/Hari : ");perawat[jumlahPerawat].setJamkj(inputan.nextInt());
            inputan.nextLine();
            jumlahPerawat++;
            System.out.println("\nAnda sudah berhasil menambahkan 1 data baru perawat!");
        }
        //EXCEPTION DIJALANKAN JIKA DATA MELEBIHI KAPASITAS ARRAY PERAWAT
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Data sudah melebihi kapasitas!");
        }
    }

    //PRINT DATA PERAWAT
    public void printDataPerawat(){
        try{
            if (jumlahPerawat <= 0){
                throw new InterruptedException();
            }
            System.out.println("========< Data Perawat >========");
            for (int i = 0; i < jumlahPerawat; i++){
                System.out.println("Data "+(i+1)+" :");
                System.out.println("\t ID       : " + perawat[i].getId());
                System.out.println("\t Nama     : " + perawat[i].getNama());
                System.out.println("\t Umur     : " + perawat[i].getUmur());
                System.out.println("\t Jabatan  : " + perawat[i].getJabatan());
                System.out.println("\t Gaji     : " + perawat[i].getGaji());
                System.out.println("\t Jam/Hari : " + perawat[i].getJamkj());
                System.out.println();
            }
        }catch (InterruptedException e){
            //EXCEPTION DIJALANKAN JIKA DATA MASIH KOSONG
            System.out.println("Data masih kosong! Tolong diisi terlebih dahulu.");
        }
    }

    //DATA PERAWAT DI RECORD, DISIMPAN DI LOG PERAWAT
    public void printLogPerawat() {
        try{
            if (jumlahPerawat <= 0) throw new InterruptedException();
            try {
                java.io.PrintWriter output = new java.io.PrintWriter(filePerawat);
                output.println("========< Data Perawat >========");
                for (int i = 0; i < jumlahPerawat; i++){
                    output.println("Data "+(i+1)+" :");
                    output.println("\t Id        : " + perawat[i].getId());
                    output.println("\t Nama      : " + perawat[i].getNama());
                    output.println("\t Umur      : " + perawat[i].getUmur());
                    output.println("\t Jabatan   : " + perawat[i].getJabatan());
                    output.println("\t Gaji      : " + perawat[i].getGaji());
                    output.println("\t Jam/Hari  : " + perawat[i].getJamkj());
                    output.println();
                }
                output.close();
            }
            catch (FileNotFoundException e){
                e.printStackTrace();
            }
        }
        //EXCEPTION DIJALANKAN JIKA DATA MASIH KOSONG
        catch (InterruptedException e){
            System.out.println("Data masih kosong! Jadi tidak bisa diprint out.");
        }
    }

    //INPUT DATA STAFF
    public void inputDataStaff(){
        try {
            if (jumlahStaff >= staff.length){
                throw new ArrayIndexOutOfBoundsException();
            }
            staff[jumlahStaff] = new Staff(1,1,1,1,"a","a");
            System.out.println("Anda memiliki : " + jumlahStaff+" Staff.");
            String generateId = ("1000"+jumlahStaff+"2021");
            staff[jumlahStaff].setId(Integer.parseInt(generateId));
            System.out.print("Masukan Nama     : ");staff[jumlahStaff].setNama(inputan.nextLine());
            System.out.print("Masukan Jabatan  : ");staff[jumlahStaff].setJabatan(inputan.nextLine());
            System.out.print("Masukan Umur     : ");staff[jumlahStaff].setUmur(inputan.nextInt());
            System.out.print("Masukan Gaji     : ");staff[jumlahStaff].setGaji(inputan.nextInt());
            System.out.print("Masukan Jam/Hari : ");staff[jumlahStaff].setJamkj(inputan.nextInt());
            inputan.nextLine();
            jumlahStaff++;
            System.out.println("\nAnda sudah berhasil menambahkan 1 data baru staff!");
        }
        //EXCEPTION DIJALANKAN JIKA DATA MELEBIHI KAPASITAS ARRAY DOKTER
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Data sudah melebihi kapasitas!");
        }
    }
    //PRINT STAFF
    public void printDataStaff(){
        try{
            if (jumlahStaff <= 0){
                throw new InterruptedException();
            }
            System.out.println("========< Data Staff >========");
            for (int i = 0; i < jumlahStaff; i++){
                System.out.println("Data "+(i+1)+" :");
                System.out.println("\t Id       : " + staff[i].getId());
                System.out.println("\t Nama     : " + staff[i].getNama());
                System.out.println("\t Umur     : " + staff[i].getUmur());
                System.out.println("\t Jabatan  : " + staff[i].getJabatan());
                System.out.println("\t Gaji     : " + staff[i].getGaji());
                System.out.println("\t Jam/Hari : " + staff[i].getJamkj());
                System.out.println();
            }
        }
        //EXCEPTION DIJALANKAN JIKA DATA MASIH KOSONG
        catch (InterruptedException e){
            System.out.println("Data masih kosong! Tolong diisi terlebih dahulu.");
        }
    }
    //DATA STAFF DI RECORD, DISIMPAN DI LOG STAFF
    public void printLogStaff() {
        try{
            if (jumlahStaff <= 0) throw new InterruptedException();
            try {
                java.io.PrintWriter output = new java.io.PrintWriter(fileStaff);
                output.println("========< Data Staff >========");
                for (int i = 0; i < jumlahStaff; i++){
                    output.println("Data "+(i+1)+" : ");
                    output.println("\t Id       : " + staff[i].getId());
                    output.println("\t Nama     : " + staff[i].getNama());
                    output.println("\t Umur     : " + staff[i].getUmur());
                    output.println("\t Jabatan  : " + staff[i].getJabatan());
                    output.println("\t Gaji     : " + staff[i].getGaji());
                    output.println("\t Jam/Hari : " + staff[i].getJamkj());
                    output.println();
                }
                output.close();
            }
            catch (FileNotFoundException e){
                e.printStackTrace();
            }
        }
        //EXCEPTION DIJALANKAN JIKA DATA MASIH KOSONG
        catch (InterruptedException e){
            System.out.println("Data masih kosong! Jadi tidak bisa diprint out.");
        }
    }
    //INPUT DATA PASIEN
    public void inputDataPasien(){
        try {
            if (jumlahPasien >= pasien.length){
                throw new ArrayIndexOutOfBoundsException();
            }
            pasien[jumlahPasien] = new Pasien(1, "a", 1 , "a", "a", "a", "a");
            System.out.println("Anda memiliki : " + jumlahPasien + " Pasien.");
            System.out.print("Masukan Nik           : ");pasien[jumlahPasien].setNik(inputan.nextInt());
            inputan.nextLine();
            System.out.print("Masukan Nama          : ");pasien[jumlahPasien].setNama(inputan.nextLine());
            System.out.print("Masukan Jenis Kelamin : ");pasien[jumlahPasien].setJk(inputan.nextLine());
            System.out.print("Masukan Alamat        : ");pasien[jumlahPasien].setAlamat(inputan.nextLine());
            System.out.print("Masukan Penyakit      : ");pasien[jumlahPasien].setPenyakit(inputan.nextLine());
            System.out.print("Masukan Umur          : ");pasien[jumlahPasien].setUmur(inputan.nextInt());
            inputan.nextLine();
            pasien[jumlahPasien].setStatus("Sakit");
            jumlahPasien++;
            System.out.println("\nAnda sudah berhasil menambahkan 1 data baru pasien!");
        }
        //EXCEPTION DIJALANKAN JIKA DATA MELEBIHI KAPASITAS ARRAY PASIEN
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Data sudah melebihi kapasitas!");
        }
    }
    //PRINT DATA PASIEN
    public void printDataPasien(){
        try{
            if (jumlahPasien <= 0){
                throw new InterruptedException();
            }
            System.out.println("========< Data Pasien >========");
            for (int i = 0; i < jumlahPasien; i++){
                System.out.println("Data "+(i+1)+" :");
                System.out.println("\t Nik           : " + pasien[i].getNik());
                System.out.println("\t Nama          : " + pasien[i].getNama());
                System.out.println("\t Umur          : " + pasien[i].getUmur());
                System.out.println("\t Jenis Kelamin : " + pasien[i].getJk());
                System.out.println("\t Penyakit      : " + pasien[i].getPenyakit());
                System.out.println("\t Status        : " + pasien[i].getStatus());
                System.out.println();
            }
        }//EXCEPTION DIJALANKAN JIKA DATA MASIH KOSONG
        catch (InterruptedException e){
            System.out.println("Data masih kosong! Tolong diisi terlebih dahulu.");
        }
    }
    //DATA PASIEN DI RECORD, DISIMPAN DI LOG PASIEN
    public void printLogPasien() {
        try{
            if (jumlahPasien <= 0) throw new InterruptedException();
            try {
                java.io.PrintWriter output = new java.io.PrintWriter(filePasien);
                output.println("========< Data Pasien >========");
                for (int i = 0; i < jumlahPasien; i++){
                    output.println("Data "+(i+1)+" :");
                    output.println("\t Nik           : " + pasien[i].getNik());
                    output.println("\t Nama          : " + pasien[i].getNama());
                    output.println("\t Umur          : " + pasien[i].getUmur());
                    output.println("\t Jenis Kelamin : " + pasien[i].getJk());
                    output.println("\t Penyakit      : " + pasien[i].getPenyakit());
                    output.println("\t Status        : " + pasien[i].getStatus());
                    output.println();
                }
                output.close();
            }
            catch (FileNotFoundException e){
                e.printStackTrace();
            }
        }//EXCEPTION DIJALANKAN JIKA DATA MASIH KOSONG
        catch (InterruptedException e){
            System.out.println("Data masih kosong! Jadi tidak bisa diprint out.");
        }
    }

    //UBAH DATA STATUS PASIEN SEMBUH / BELUM SEMBUH
    public void ubahStatusPasien(){
        printDataPasien();
        try {
            if (jumlahPasien <= 0)throw new InterruptedException();
            System.out.print("Masukan data pasien keberapa yang ingin diubah :");
            int pilih = inputan.nextInt(); inputan.nextLine();
            pasien[pilih-1].setStatus("Sembuh");
            System.out.println("Pasien ke-" + pilih + " sudah sembuh.");
        }
        catch (InterruptedException e){
            System.out.println("................");
        }
    }

    //GETTER JUMLAH PASIEN, DOKTER, PERAWAT DAN STAFF
    public int getJumlahPasien() {
        return jumlahPasien;
    }
    public int getJumlahDokter() {
        return jumlahDokter;
    }
    public int getJumlahPerawat() {
        return jumlahPerawat;
    }
    public int getJumlahStaff() {
        return jumlahStaff;
    }
}
