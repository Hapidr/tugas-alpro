public class algoritmaDasar {
    public static void main(String[] args) {
//      volume bola
        double r, volume;
        r = 7;
        volume = 4 / 3. * 3.14 * (r * r * r);
        System.out.println("Volume bola = " + volume);

//        Luas Segitiga
        double a, t, luas;
        a = 6;
        t = 7;
        luas = 1/2. * a * t;
        System.out.println("Luas segitiga = " + luas);

//      operasi matematika
        int x , y, tambah, kurang, kali, bagi;
        x = 10;
        y = 5;

        tambah = x + y;
        kurang = x - y;
        kali = x * y;
        bagi = x / y;
        System.out.println("x - y = " + kurang);
        System.out.println("x + y = " + tambah);
        System.out.println("x * y = " + kali);
        System.out.println("x / y = " + bagi);
    }
}
