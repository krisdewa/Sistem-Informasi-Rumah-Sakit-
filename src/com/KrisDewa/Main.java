package com.KrisDewa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        RumahSakit rs = new RumahSakit();
        Scanner input = new Scanner(System.in);
        boolean loop = true;

        MenuUtama:
        while (true){
            System.out.println("===< Sistem Rumah Sakit >===");
            System.out.println(" 1. Pegawai");
            System.out.println(" 2. Pasien");
            System.out.println(" 3. Exit");
            System.out.println("============================");
            System.out.print(" Masukkan Pilihan anda : ");
            try {
                int pilih = input.nextInt(); input.nextLine();
                switch (pilih){
                    case 1:{
                        Submenu1:
                        while (true){
                            System.out.println("======< Menu Pegawai >======");
                            System.out.println("\t 1. Dokter");
                            System.out.println("\t 2. Perawat");
                            System.out.println("\t 3. Staff");
                            System.out.println("\t 4. Exit");
                            System.out.println("============================");
                            System.out.print("Masukkan Pilihan anda : ");
                            try {
                                pilih = input.nextInt();
                                switch (pilih){
                                    case 1:{
                                        Submenu2:
                                        while (true){
                                            System.out.println("=======< Menu Dokter >=======");
                                            System.out.println(" Jumlah Dokter : " + rs.getJumlahDokter());
                                            System.out.println("=============================");
                                            System.out.println("\t 1. Tambah Data");
                                            System.out.println("\t 2. Lihat Data");
                                            System.out.println("\t 3. Exit");
                                            System.out.print("Masukkan Pilihan Anda : ");
                                            try {
                                                pilih = input.nextInt();
                                                switch (pilih){
                                                    case 1 :{
                                                        rs.inputDataDokter();
                                                        rs.printLogDokter();
                                                        continue Submenu2;
                                                    }
                                                    case 2:{
                                                        rs.printDataDokter();
                                                        continue Submenu2;
                                                    }
                                                    case 3: {
                                                        break Submenu2;
                                                    }
                                                    default: {
                                                        System.out.println("INPUT SALAH, SILAHKAN INPUT ULANG !!!");
                                                        continue Submenu2;
                                                    }

                                                }
                                            }
                                            catch (InputMismatchException e){
                                                System.out.println("INPUT SALAH, SILAHKAN JALANKAN PROGRAM ULANG !!!");
                                                loop = false;
                                                break Submenu2;
                                            }
                                        }
                                        if (!loop) break Submenu1;
                                        continue Submenu1;
                                    }
                                    case 2:{
                                        Submenu2:
                                        while (true){
                                            System.out.println("=======< Menu Perawat >=======");
                                            System.out.println(" Jumlah Perawat : "+rs.getJumlahPerawat());
                                            System.out.println("==============================");
                                            System.out.println("\t 1. Tambah Data");
                                            System.out.println("\t 2. Lihat Data");
                                            System.out.println("\t 3. Exit");
                                            System.out.print("Masukkan Pilihan Anda : ");
                                            try {
                                                pilih = input.nextInt();
                                                switch (pilih){
                                                    case 1 :{
                                                        rs.inputDataPerawat();
                                                        rs.printLogPerawat();
                                                        continue Submenu2;
                                                    }
                                                    case 2:{
                                                        rs.printDataPerawat();
                                                        continue Submenu2;
                                                    }
                                                    case 3: {
                                                        break Submenu2;
                                                    }
                                                    default: {
                                                        System.out.println("INPUT SALAH, SILAHKAN INPUT ULANG !!!");
                                                        continue Submenu2;
                                                    }

                                                }
                                            }
                                            catch (InputMismatchException e){
                                                System.out.println("INPUT SALAH, SILAHKAN JALANKAN PROGRAM ULANG !!!");
                                                loop = false;
                                                break Submenu2;
                                            }
                                        }
                                        if (!loop) break Submenu1;
                                        continue Submenu1;

                                    }
                                    case 3:{
                                        Submenu2:
                                        while (true){
                                            System.out.println("=======< Menu Staff >=======");
                                            System.out.println(" Jumlah Staff : "+rs.getJumlahStaff());
                                            System.out.println("============================");
                                            System.out.println("\t 1. Tambah Data");
                                            System.out.println("\t 2. Lihat Data");
                                            System.out.println("\t 3. Exit");
                                            System.out.print("Masukkan Pilihan Anda : ");
                                            try {
                                                pilih = input.nextInt();
                                                switch (pilih){
                                                    case 1 :{
                                                        rs.inputDataStaff();
                                                        rs.printLogStaff();
                                                        continue Submenu2;
                                                    }
                                                    case 2:{
                                                        rs.printDataStaff();
                                                        continue Submenu2;
                                                    }
                                                    case 3: {
                                                        break Submenu2;
                                                    }
                                                    default: {
                                                        System.out.println("INPUT SALAH, SILAHKAN INPUT ULANG !!!");
                                                        continue Submenu2;
                                                    }

                                                }
                                            }
                                            catch (InputMismatchException e){
                                                System.out.println("INPUT SALAH, SILAHKAN JALANKAN PROGRAM ULANG !!!");
                                                loop = false;
                                                break Submenu2;
                                            }
                                        }
                                        if (!loop) break Submenu1;
                                        continue Submenu1;
                                    }
                                    case 4: {
                                        break Submenu1;
                                    }
                                    default: {
                                        System.out.println("INPUT SALAH, SILAHKAN INPUT ULANG !!!");
                                        continue Submenu1;
                                    }
                                }
                            }
                            catch (InputMismatchException e){
                                System.out.println("INPUT SALAH, SILAHKAN JALANKAN PROGRAM ULANG !!!");
                                loop = false;
                                break Submenu1;
                            }
                        }
                        if (!loop) break MenuUtama;
                        continue MenuUtama;
                    }
                    case 2:{
                        Submenu1:
                        while (true){
                            System.out.println("======< Menu Pasien >======");
                            System.out.println(" Jumlah Pasien : "+rs.getJumlahPasien());
                            System.out.println("===========================");
                            System.out.println("\t 1. Tambah Data");
                            System.out.println("\t 2. Lihat Data");
                            System.out.println("\t 3. Ubah Status Pasien");
                            System.out.println("\t 4. Exit");
                            System.out.print("Masukkan Pilihan Anda : ");
                            try {
                                pilih = input.nextInt();
                                switch (pilih){
                                    case 1 :{
                                        rs.inputDataPasien();
                                        rs.printLogPasien();
                                        continue Submenu1;
                                    }
                                    case 2:{
                                        rs.printDataPasien();
                                        continue Submenu1;
                                    }
                                    case 3:{
                                        rs.ubahStatusPasien();
                                        rs.printLogPasien();
                                        continue Submenu1;
                                    }
                                    case 4: {
                                        break Submenu1;
                                    }
                                    default: {
                                        System.out.println("INPUT SALAH, SILAHKAN INPUT ULANG !!!");
                                        continue Submenu1;
                                    }

                                }
                            }
                            catch (InputMismatchException e){
                                System.out.println("INPUT SALAH, SILAHKAN JALANKAN PROGRAM ULANG !!!");
                                loop = false;
                                break Submenu1;
                            }
                        }
                        if (!loop) break MenuUtama;
                        continue MenuUtama;
                    }
                    case 3: {
                        System.out.println("..... TERIMAKASIH .....");
                        break MenuUtama;
                    }
                    default: {
                        System.out.println("INPUT SALAH, SILAHKAN INPUT ULANG !!!");
                        continue MenuUtama;
                    }
                }
            }
            catch (InputMismatchException e){
                System.out.println("INPUT SALAH, SILAHKAN JALANKAN PROGRAM ULANG !!!");
                break MenuUtama;
            }
        }
    }
}
