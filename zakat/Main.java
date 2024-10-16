package zakat;
//dasar
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Selamat datang di program zakat");
        double harta;
        double bayar;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan total harta anda Rp. : ");
        harta = input.nextDouble();
        System.out.println("Total harta anda adalah Rp. " + harta);
        bayar = harta * 2.5 / 100;
        System.out.println("Zakat yang harus anda bayar adalah Rp. " + bayar);

    }
}
