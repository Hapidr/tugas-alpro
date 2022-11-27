public class Bab7No3DoWhile {
    public static void main(String[] args) {
        int i = 1, jumlah = 0;
        do {
            if (i%3==0){
                System.out.print(i + " ");
                jumlah += i;
            }
            i++;
        } while (i<=15);
        System.out.println("\nTotal bilangan tersebut adalah " + jumlah);
    }
}
