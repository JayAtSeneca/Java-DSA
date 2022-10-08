public class MaxSubArraySum {
    // public static int subArraySum(int numbers[]){
    // int currSum = 0;
    // int maxSum = 0;
    // for(int i=0;i<numbers.length;i++){
    // for(int j = i; j<numbers.length; j++){
    // currSum = 0;
    // for(int k=i;k<=j;k++){
    // currSum += numbers[k];
    // }
    // if(maxSum < currSum){
    // maxSum = currSum;
    // }

    // }

    // }
    // return maxSum;
    // }
    public static int subArraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = 0;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

                if (maxSum < currSum) {
                    maxSum = currSum;
                }

            }

        }
        return maxSum;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        System.out.print(subArraySum(numbers));
    }
}
