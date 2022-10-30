import java.util.Scanner;

public class Bab6No1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int masukkan = input.nextInt();
        switch (masukkan) {
            case (1):
                System.out.println("ANDA NAIK PESAWAT TERBANG");
                break;
            case (2):
                System.out.println("ANDA NAIK KERETA API");
                break;
            case (3):
                System.out.println("ANDA NAIK BUS");
                break;
            case (4):
                System.out.println("ANDA NAIK TAKSI");
                break;
            case (5):
                System.out.println("ANDA NAIK MOBIL PRIBADI");
                break;
            case (6):
                System.out.println("ANDA NAIK MOTOR");
                break;
            default:
                System.out.println("Anda salah Memilih");
        }
    }
}
