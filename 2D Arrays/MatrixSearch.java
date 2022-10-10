import java.util.*;
public class MatrixSearch {
    public static boolean search(int[][] matrix, int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    return true;
                }
            }
        }
        return false;
    }
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
        System.out.println(search(matrix, 3));
    }
}
