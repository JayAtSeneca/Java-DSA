public class LinearSearch {
    public static int linearSearch(int arr[], int key, int index){
        if(index == arr.length-1){
            return -1;
        }
        else if(arr[index] == key){
            return index;
        }
        return linearSearch(arr, key, index+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.print(linearSearch(arr,3,0));
    }
}
