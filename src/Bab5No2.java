import java.util.Scanner;

public class Bab5No2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan suhu: ");
        int suhu = input.nextInt();

        if (suhu > 100) {
            System.out.println("berwujud Uap");
        } else if (suhu >= 0 && suhu <= 100) {
            System.out.println("Berwujud cair");
        } else {
            System.out.println("Berwujud Padat");
        }
    }
}
