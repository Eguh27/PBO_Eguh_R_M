package percabangan;
//percabangan
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Penghitung Nilai");
        System.out.print("Masukkan Nilai : ");
        int angka = input.nextInt();
        if(angka >= 90 && angka <= 100) {
            System.out.println("A");
        } else if (angka >= 80 && angka <= 89) {
            System.out.println("A-");
        } else if (angka >= 70 && angka <= 79) {
            System.out.println("B");
        } else if (angka >= 65 && angka <= 69) {
            System.out.println("B-");
        } else if (angka >= 56 && angka <= 64) {
            System.out.println("C");
        } else if (angka >= 55 && angka <= 40) {
            System.out.println("D");
        } else if (angka >= 39 && angka <=0) {
            System.out.println("E");
        } else {
            System.out.println("Input Angka");
        }
    }
    
}
