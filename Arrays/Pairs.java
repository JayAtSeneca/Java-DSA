public class Pairs {
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        int n = 5;
        for(int i = 0; i<n;i++){
            int curr = numbers[i];
            for(int j = i+1; j<n;j++){
                System.out.print("("+curr+", "+ numbers[j]+")");
            }
            System.out.println();
        }
    }
}
