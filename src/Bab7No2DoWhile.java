public class Bab7No2DoWhile {
    public static void main(String[] args) {
        int i = 1;
        do {
            if (i % 5 == 0){
                System.out.println(i);
            }
            i++;
        } while (i<=500);
    }
}
