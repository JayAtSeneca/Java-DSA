public class Sum {
    public static int sum(int num) {
        int rc = 0;
        if (num > 0) {
            rc = num + sum(num - 1);
        }
        return rc;
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
