public class BinarySearch {
    public static int binarySearch(int numbers[], int key){
        int start = 0;
        int end = numbers.length - 1;
        while(start<=end){
            int midIndex = (start+end)/2;
            if(numbers[midIndex] == key ){
                return midIndex;
            }
            else if(key<numbers[midIndex]){
                end = midIndex - 1;
            }
            else{
                start = midIndex + 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10,12,14};
        int key = 1;
        
        System.out.println(binarySearch(numbers, key));
    }
}
