public class IncreasingOrder {
    public static void printIncreasing(int num) {
        if (num == 1) {
            System.out.print(num+" ");
            return;
        }
        printIncreasing(num - 1);
        System.out.print(num + " ");
    }

    public static void main(String[] args) {
        printIncreasing(5);
    }
}
