import java.util.Scanner;

public class Bab2No2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM: ");
        double nim = input.nextLong();
        input.nextLine();

        System.out.print("Masukkan Alamat: ");
        String alamat = input.nextLine();

        System.out.print("Masukkan Jurusan: ");
        String jurusan = input.nextLine();

        System.out.print("Masukkan Semester: ");
        int semester = input.nextInt();

        System.out.println(alamat + jurusan + semester);
    }
}