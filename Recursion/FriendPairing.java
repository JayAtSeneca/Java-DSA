public class FriendPairing {
    public static int friendsPairing(int n){
        if(n==1 || n==2){
            return n;
        }
        //recursive part
        return friendsPairing(n-1) + ((n-1) * friendsPairing(n-2));
    }
    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }
}
