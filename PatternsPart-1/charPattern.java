import java.util.*;
public class charPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int input = sc.nextInt();
        char pattern = 'A';
        for(int i = 1; i<=input;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(pattern + " ");
                pattern++;
            }
            System.out.println();
        }
        sc.close();
    }
}
