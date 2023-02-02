public class Pairsum1 {
    static void Pair(int arr[], int k) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                sum = arr[i] + arr[j];
                if(sum == k) {
                    System.out.println("Pair Found " + arr[i] + "," + arr[j]);
                    return;
                }
            }
        }
    }
        
        public static void main(String[] args) {
        int arr[]= {6,3,4,7,8,1,2};
        int k= 10;
        Pair(arr,k) ;
        }}
