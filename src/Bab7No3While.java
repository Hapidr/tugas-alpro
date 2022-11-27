public class Bab7No3While {
    public static void main(String[] args) {
        int i = 1, jumlah = 0;
        while (i <= 15){
            if (i%3==0){
                System.out.print(i + " ");
                jumlah += i;
            }
            i++;
        }
        System.out.println("\nTotal bilangan tersebut adalah " + jumlah);
    }
}
