public class DecreasingOrder {
    public static void decreasingOrder(int num) {
        if (num > 0) {
            System.out.print(num + " ");
            decreasingOrder(num - 1);
        }
    }

    public static void main(String[] args) {
        decreasingOrder(5);
    }
}