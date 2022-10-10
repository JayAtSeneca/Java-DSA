import java.util.*;
public class Matrices{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int column = sc.nextInt();

        int matrix[][] = new int[rows][column];
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                matrix[i][j] = i+j;
            }
        }
        sc.close();
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}