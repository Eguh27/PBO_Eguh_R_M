package tugas3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        
        do {
            System.out.println("Selamat Datang di Program Penghitung Zakat");
            System.out.println("1. Zakat Mal");
            System.out.println("2. Zakat Emas");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan anda: ");
            pilihan = input.nextInt();
            
            switch (pilihan) {
                case 1:
                    hitungZakatMal();
                    break;
                case 2:
                    hitungZakatEmas();
                    break;
                case 3:
                    System.out.println("Keluar Program.");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
            }
        } while (pilihan != 3);
        
        input.close();
    }
    
    private static void hitungZakatMal() {
        Scanner input = new Scanner(System.in);
        System.out.println("Zakat Mal");
        System.out.print("Masukkan total harta anda: ");
        double harta = input.nextDouble();
        
        double nisab = 85 * 650000; 
        
        if (harta >= nisab) {
            double bayar = harta * 2.5 / 100;
            System.out.println("Total harta anda adalah Rp. " + harta);
            System.out.println("Zakat yang harus anda bayar adalah Rp. " + bayar);
        } else {
            System.out.println("Total harta anda adalah Rp. " + harta);
            System.out.println("Anda tidak diwajibkan membayar zakat karena harta belum mencapai nisab.");
        }
    }
    
    private static void hitungZakatEmas() {
        Scanner input = new Scanner(System.in);
        System.out.println("Zakat Emas");
        System.out.print("Masukkan total emas anda (dalam gram): ");
        double emas = input.nextDouble();
        
        if (emas >= 85) {
            double bayar = emas * 2.5 / 100;
            System.out.println("Total emas anda adalah " + emas + " gram");
            System.out.println("Zakat yang harus anda bayar adalah " + bayar + " gram emas");
        } else {
            System.out.println("Total emas anda adalah " + emas + " gram");
            System.out.println("Anda tidak diwajibkan membayar zakat karena emas belum mencapai nisab (85 gram).");
        }
    }
}
