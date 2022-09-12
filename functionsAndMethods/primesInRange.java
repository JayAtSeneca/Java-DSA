import java.util.*;
public class primesInRange{
    public static boolean isPrime(int num){
        if(num == 2){
            return true;
        }
        for(int i = 2; i<Math.sqrt(num); i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primesInRanges(int n){

        if(n==2){
            System.out.print("2 ");
        }
        for(int i = 2; i<n-1;i++){
            if(!isPrime(n)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        primesInRanges(input);
        sc.close();
    }
}