import java.util.Scanner;

public class Bab7No1DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Banyaknya data : ");
        float hasil = 0;
        int data, i = 1, banyak_data = input.nextInt();

        do {
            System.out.print("Data ke-" + i + " : ");
            data = input.nextInt();
            hasil += data;
            i++;
        } while (i <= banyak_data);
        System.out.println("Rata-rata : " + (hasil/banyak_data));
        System.out.println("Jumlah : " + hasil);
    }
}
