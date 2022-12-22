import java.util.Scanner;

public class MatriksTranspose {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan ordo:");
        int ordo = input.nextInt();
        int [][] matriks = new int[ordo][ordo];
        int [][] transpose = new int[ordo][ordo];

        for (int i=0;i<ordo;i++){
            for (int j=0;j<ordo;j++){
                System.out.print("Baris " + (i+1) + "Kolom " + (j+1) + ": ");
                matriks[i][j] = input.nextInt();
            }
        }

        System.out.print("Matriks: ");
        for (int i=0;i<ordo;i++){
            for (int j=0;j<ordo;j++){
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Hasil transpose matriks:");
        for (int i=0;i<ordo;i++){
            for (int j=0;j<ordo;j++){
                transpose[i][j] = matriks[i][j];
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }
        input.close();
    }
}
