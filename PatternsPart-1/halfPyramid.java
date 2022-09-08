import java.util.*;
public class halfPyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int input = sc.nextInt();
        for(int i = 1; i<= input;i++){
            for(int j = 1; j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
