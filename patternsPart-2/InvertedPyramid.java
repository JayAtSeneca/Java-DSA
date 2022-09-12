public class InvertedPyramid {

    public static void inverted(int totalRows, int totalColumns) {
        for (int i = 1; i <= totalRows; i++) {
            for(int j = 1; j<=totalRows-i;j++){
                System.out.print("  ");
            }
            for(int k = 1; k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inverted(4, 5);
    }

}
