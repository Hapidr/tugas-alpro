import java.util.Scanner;

public class Bab7No1While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Banyaknya data : ");
        float hasil = 0;
        int data, i = 1, banyak_data = input.nextInt();
        while (i<=banyak_data) {
            System.out.print("Data ke-" + i + " : ");
            data = input.nextInt();
            hasil += data;
            i++;
        }
        System.out.println("Rata-rata : " + (hasil/banyak_data));
        System.out.println("Jumlah : " + hasil);
    }
}
