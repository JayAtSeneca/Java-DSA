public class Factorial {
    public static int fact(int num){
        int rc = 1;
        if(num>1){
            rc = num * fact(num - 1);
        }
        return rc;
    }
    public static void main(String[] args) {
       System.out.println(fact(4));
    }
}
