import java.util.Scanner;

public class Matriks2Dimensi {
    public static void main(String[] args) {
        int i, j, m, n;
        int matriks1 [][] = new int[10][10];
        int matriks2 [][] = new int[10][10];

        int hasil [][] = new int[10][10];

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris = ");
        m = input.nextInt();
        System.out.print("Masukkan jumlah kolom = ");
        n = input.nextInt();
        System.out.println("Masukkan elemen matriks pertama = ");

        for (i = 0;i<m;i++){
            for (j=0;j<n;j++){
                matriks1[i][j] = input.nextInt();
            }
        }

        System.out.println("Masukkan elemen matriks kedua = ");
        for (i = 0;i<m;i++){
            for (j=0;j<n;j++){
                matriks2[i][j] = input.nextInt();
            }
        }

        System.out.println("Hasil penjumlahan matriks : ");
        for (i = 0;i<m;i++){
            for (j=0;j<n;j++){
                hasil[i][j] = matriks1[i][j] + matriks2[i][j];
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
