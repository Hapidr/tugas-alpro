import java.util.Scanner;

public class Bab4No1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r, t, volume, phi;
        phi = 3.14;
        System.out.print("Masukkan jari-jari : ");
        r = input.nextFloat();
        System.out.print("Masukkan tinggi : ");
        t = input.nextFloat();

        volume = phi * (r * r) * t;
        System.out.println("Volume tabung adalah = " + volume);
    }
}
