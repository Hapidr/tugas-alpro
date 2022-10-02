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
        luas = 0.5 * a * t;
        System.out.println("Luas segitiga = " + luas);

//      operasi matematika
        int x , y;
        x = 10;
        y = 5;

        System.out.println("x - y = " + (x - y));
        System.out.println("x + y = " + (x + y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
    }
}
