package com.zakat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double hargaBeras = 12000;   // Harga default beras per kilogram (misal)

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

            ZakatInterface zakat = switch (pilihan) {
                case 1 -> {
                    System.out.print("Total harta: ");
                    yield new ZakatMal(scanner.nextDouble());
                }
                case 2 -> {
                    System.out.print("Penghasilan bulanan: ");
                    yield new ZakatPenghasilan(scanner.nextDouble());
                }
                case 3 -> {
                    System.out.print("Jumlah anggota keluarga: ");
                    yield new ZakatFitrah(scanner.nextInt(), hargaBeras);
                }
                default -> null;
            };

            if (zakat != null) {
                System.out.printf("Jumlah zakat yang harus dibayar: %.2f\n", zakat.hitungZakat());
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
