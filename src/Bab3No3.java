import java.util.Scanner;

public class Bab3No3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tinggi, alas;
        double luas;

        System.out.print("Masukkan tinggi : ");
        tinggi = input.nextInt();
        System.out.print("Masukkan alas : ");
        alas = input.nextInt();
        luas = (1/2. * alas) * tinggi;

        System.out.println("Luas segitiga adalah " + luas);
    }
}
