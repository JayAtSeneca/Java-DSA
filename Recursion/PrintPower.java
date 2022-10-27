public class PrintPower {
    public static int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * pow(x, n - 1);
    }

    // this will have the run time complexity of O(log n)
    public static int pow2(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = pow2(x, n / 2);
        int halfPowerSq = halfPower * halfPower;
        return n % 2 == 0 ? halfPowerSq : (x * halfPowerSq);
    }

    public static void main(String[] args) {
        System.out.print(pow2(2, 4));
    }
}
