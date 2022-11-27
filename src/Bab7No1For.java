import java.util.Scanner;

public class Bab7No1For {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float hasil = 0;
        System.out.print("Banyaknya data : ");
        float banyak_data = input.nextInt();
        for (int i=0; i<banyak_data; i++){
            System.out.print("Data ke-" + (i+1) + " : ");
            int data = input.nextInt();
            hasil += data;
        }
        System.out.println("Rata-rata : " + (hasil/banyak_data));
        System.out.println("Jumlah : " + hasil);
    }
}
