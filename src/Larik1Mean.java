import java.util.Scanner;

public class Larik1Mean {
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

        float jumlah = 0;
        for (int i = 0; i < 5; i++) {
            jumlah += nilai[i];
        }

        System.out.println("\nJumlah = " + jumlah);
        System.out.println("Rata-rata = " + (jumlah / nilai.length));
    }
}
