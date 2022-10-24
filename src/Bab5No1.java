import java.util.Scanner;

public class Bab5No1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai a: ");
        int a = input.nextInt();
        System.out.print("Masukkan nilai b: ");
        int b = input.nextInt();
        System.out.print("Masukkan nilai c: ");
        int c = input.nextInt();

        int d = b*b-(4*a*c);
        if (d == 0){
            System.out.println(d + " Akar kembar");
        } else if (d > 0){
            System.out.println(d + " Akar beda");
        } else{
            System.out.println(d + " Akar imajiner");
        }

    }

}
