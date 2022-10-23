import java.util.Scanner;

public class Bab3No2 {
    public static void main(String[] args) {
        int r;
        double keliling, luas, phi;
        Scanner input = new Scanner(System.in);
        System.out.print("r = ");
        r = input.nextInt();
        phi = 3.14;

        keliling = 2 * phi * r;
        luas = phi * (r*r);
        System.out.println("Keliling lingkaran = " + keliling);
        System.out.println("Luas lingkaran = " + luas);
    }
}
