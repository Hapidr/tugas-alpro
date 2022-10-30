import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1 = TIF/S1\n2 = SI/S1\n3 = TI/S1\n4 = MT/S1\n5 = TE/S1");
        System.out.print("Masukkan pilihan: ");
        int pil = input.nextInt();

        switch (pil) {
            case (1):
                System.out.println("Jurusan TIF/S1");
                break;
            case (2):
                System.out.println("Jurusan SI/S1");
                break;
            case (3):
                System.out.println("Jurusan TI/S1");
                break;
            case (4):
                System.out.println("Jurusan MT/S1");
                break;
            case (5):
                System.out.println("Jurusan TE/S1");
                break;
            default:
                System.out.println("Pilihan Salah!");
        }
    }
}
