
public class Bab7No3For {
    public static void main(String[] args) {
        int jumlah = 0;
        for (int i=1;i<=15;i++){
            if (i%3==0){
                jumlah += i;
                System.out.print(i + " ");
            }
        }
        System.out.println("\nTotal bilangan tersebut adalah " + jumlah);
    }
}
