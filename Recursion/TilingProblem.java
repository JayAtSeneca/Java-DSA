public class TilingProblem {
    public static int tiling(int n){
        // base case
        if(n==0 || n==1){
            return 1;
        }
        // vertical tiling case and horizontal tiling case
        return tiling(n-1) + tiling(n-2);
    }
    public static void main(String[] args) {
        System.out.print(tiling(4));
    }
}
