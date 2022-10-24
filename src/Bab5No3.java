import java.util.Scanner;

public class Bab5No3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        if (angka == 0) {
            System.out.println(angka + " adalah NOL");
        } else if (angka > 0) {
            System.out.println(angka + " adalah positif");
        } else {
            System.out.println(angka + " adalah negatif");
        }
    }
}
