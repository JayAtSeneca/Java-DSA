public class Bitwise{
    public static void evenOrOdd(int n){
        if((n&1)==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        evenOrOdd(101);
    }
}