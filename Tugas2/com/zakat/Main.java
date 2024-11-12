package com.zakat;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double hargaBeras = 12000;

            System.out.println("Gunakan harga default untuk beras?");
            System.out.println("1. Ya (Beras: Rp12.000/kg)");
            System.out.println("2. Tidak, masukkan harga sendiri");
            System.out.print("Pilihan (1/2): ");
            int pilihHarga = scanner.nextInt();

            if (pilihHarga == 2) {
                System.out.print("Masukkan harga beras per kilogram: ");
                hargaBeras = scanner.nextDouble();
            }

            System.out.println("\nPilih jenis zakat:\n1. Mal\n2. Penghasilan\n3. Fitrah");
            System.out.print("Pilihan (1/2/3): ");
            int pilihan = scanner.nextInt();

            ZakatInterface zakat = null;

            switch (pilihan) {
                case 1 -> {
                    ZakatMal zakatMal = new ZakatMal();
                    System.out.print("Total harta: ");
                    zakatMal.setTotalHarta(scanner.nextDouble());
                    zakat = zakatMal;
                }
                case 2 -> {
                    ZakatPenghasilan zakatPenghasilan = new ZakatPenghasilan();
                    System.out.print("Penghasilan bulanan: ");
                    zakatPenghasilan.setPenghasilanBulanan(scanner.nextDouble());
                    zakat = zakatPenghasilan;
                }
                case 3 -> {
                    ZakatFitrah zakatFitrah = new ZakatFitrah();
                    System.out.print("Jumlah anggota keluarga: ");
                    zakatFitrah.setJumlahAnggotaKeluarga(scanner.nextInt());
                    zakatFitrah.setHargaBeras(hargaBeras);
                    zakat = zakatFitrah;
                }
                default -> System.out.println("Pilihan tidak valid.");
            }

            if (zakat != null) {
                System.out.printf("Jumlah zakat yang harus dibayar: %.2f\n", zakat.hitungZakat());
            }
        }
    }
}

