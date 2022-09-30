public class Tugas {
//    function main untuk menjalankan atau memanggil function lain
    public static void main(String[] args) {
        volume_bola();
        luas_segitiga();
        operasi_matematika();
    }

//    method untuk menghitung volume bola
    public static void volume_bola() {
        double r, volume;
        r = 7;
        volume = 4 / 3. * 3.14 * (r * r * r);
        System.out.println("Volume bola = " + volume);
    }

//    metho duntuk menghitung luas segitiga
    public static void luas_segitiga() {
        double a, t, luas;
        a = 6;
        t = 7;
        luas = 0.5 * a * t;
        System.out.println("Luas segitiga = " + luas);
    }

//    method untuk menghitung operasi matematika
    public static void operasi_matematika() {
        int x , y;
        x = 10;
        y = 5;

        System.out.println("x - y = " + (x - y));
        System.out.println("x + y = " + (x + y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
    }
}
