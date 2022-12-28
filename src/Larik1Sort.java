import java.util.Scanner;

public class Larik1Sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] nilai = new float[5];

        System.out.println("Masukkan 5 buah data nilai ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Data ke-" + (i + 1) + ": ");
            nilai[i] = input.nextFloat();
        }

        System.out.println("Data nilai yang dimasukkan");
        for (int i = 0; i < 5; i++) {
            System.out.print(nilai[i] + " | ");
        }

        float terbesar = 0, terkecil = nilai[0];
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > 0) {
                terbesar = nilai[i];
            }
        }

        for (int i = 0; i< nilai.length; i++){
            if (nilai[i]< nilai[0]){
                terkecil = nilai[i];
            }
        }

        System.out.println("\nAngka terbesar = " + terbesar);
        System.out.println("Angka terkecil = " + terkecil);
    }
}
