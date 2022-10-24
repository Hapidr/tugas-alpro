import java.util.Scanner;

public class Bab5No4 {
    public static void main(String[] args) {
        System.out.print("Masukkan angka: ");
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();
        if (angka == 0){
            System.out.println(angka + " adalah Nol");
        } else if (angka % 2 == 0){
            System.out.println(angka + " adalah bilangan Genap");
        } else{
            System.out.println(angka + " adalah bilangan Ganjil");
        }
    }
}
