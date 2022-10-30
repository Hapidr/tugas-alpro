import java.util.Scanner;

public class Bab6No2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String makanan, pilihan; int harga;
        System.out.print("Masukkan pilihan Anda : ");
        pilihan = input.next();
        switch (pilihan){
            case ("a"):
                makanan = "sate";
                harga = 20000;
                System.out.println("Makanan : " + makanan +"\nHarga : " + harga);
                harga = harga - (harga * 10/100);
                System.out.println("Total bayar : " + harga + "\nTerima kasih sudah berbelanja");
                break;
            case ("b"):
                makanan = "bakso";
                harga = 15000;
                System.out.println("Makanan : " + makanan +"\nHarga : " + harga);
                harga = harga - (harga * 10/100);
                System.out.println("Total bayar : " + harga + "\nTerima kasih sudah berbelanja");
                break;
            case ("c"):
                makanan = "Lontong Sayur";
                harga = 10000;
                System.out.println("Makanan : " + makanan +"\nHarga : " + harga);
                harga = harga - (harga * 10/100);
                System.out.println("Total bayar : " + harga + "\nTerima kasih sudah berbelanja");
                break;
            case ("d"):
                makanan = "Nasi Ramas";
                harga = 25000;
                System.out.println("Makanan : " + makanan +"\nHarga : " + harga);
                harga = harga - (harga * 10/100);
                System.out.println("Total bayar : " + harga + "\nTerima kasih sudah berbelanja");
                break;
            case ("e"):
                makanan = "steak";
                harga = 30000;
                System.out.println("Makanan : " + makanan +"\nHarga : " + harga);
                harga = harga - (harga * 10/100);
                System.out.println("Total bayar : " + harga + "\nTerima kasih sudah berbelanja");
                break;
            default:
                System.out.println("Pilihan yang Anda masukkan tidak tersedia");
        }
    }
}
