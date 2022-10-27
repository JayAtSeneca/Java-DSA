public class LastOccurence {
    public static int lastOccurence(int arr[], int key, int index){
        if(index == arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key, index + 1);
        if(isFound == -1 && arr[index] == key){
            return index;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,7,5};
        System.out.print(lastOccurence(arr, 5, 0));
    }
}
