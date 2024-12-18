//Tugas Array
package com.Tugas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Nama\t: Eguh Raga Mustika");
        System.out.println("NIM\t: 235333791");
        System.out.println("Kelas\t: 3A\n");

        ArrayList<String> Matkul = new ArrayList<>();

        // Inisialisasi
        String[] MatkulDefault = {
                "Managemen Basis data",
                "Analisis dan Desain Sistem Informasi",
                "Sistem Operasi",
                "Pancasila",
                "Praktikum Pemro. Berbasis Objek",
        };

        for (String matkul : MatkulDefault) {
            Matkul.add(matkul);
        }

        // Main Menu
        Scanner pilih = new Scanner(System.in);
        int a;
        do {
            System.out.println("\n========== Mata Kuliah =========");
            System.out.println("1. Tambah Matkul");
            System.out.println("2. Tampilkan Matkul");
            System.out.println("3. Hitung Keseluruhan Matkul");
            System.out.println("4. Keluar");
            System.out.print("Pilih : ");
            a = pilih.nextInt();
            pilih.nextLine();

            if (a == 1) {
                // Tambah Matkul
                System.out.print("Masukkan Nama Mata Kuliah : ");
                String tambah = pilih.nextLine();
                Matkul.add(tambah);
                System.out.println("Mata kuliah berhasil ditambahkan.");

            } else if (a == 2) {
                // Tampilkan Matkul
                System.out.println("\n========== Daftar Mata Kuliah =========");
                for (int i = 0; i < Matkul.size(); i++) {
                    System.out.println((i + 1) + ". " + Matkul.get(i));
                }
                System.out.println("=======================================");

                // Fitur Pencarian
                System.out.print("\nCari Mata Kuliah? (Y/N) : ");
                String tanya = pilih.nextLine();
                if (tanya.equalsIgnoreCase("Y")) {
                    System.out.print("Masukkan Nama Mata Kuliah: ");
                    String namaDicari = pilih.nextLine();

                    boolean ditemukan = false;
                    for (String matkul : Matkul) {
                        if (matkul.equalsIgnoreCase(namaDicari)) {
                            System.out.println("Mata kuliah ditemukan: " + matkul);
                            ditemukan = true;
                            break;
                        }
                    }
                    if (!ditemukan) {
                        System.out.println("Mata kuliah tidak ditemukan.");
                    }
                }

            } else if (a == 3) {
                // Hitung Keseluruhan Matkul
                System.out.println("Jumlah keseluruhan mata kuliah: " + Matkul.size());
            }

        } while (a != 4);

        pilih.close();
    }
}
