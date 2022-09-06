import java.util.*;

public class StarPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Positive Integer: ");
        int input = sc.nextInt();
        for(int i = 0; i<input;i++){
            for(int j = 0; j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
