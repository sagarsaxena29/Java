import java.util.Arrays;

// public class Pairsum3 {
// public static void main(String[] args) {
// int k = 10;
//     int arr[]= {6,4,3,9,7,1,2,7};
//     Arrays.sort(arr);
//     int first=0;
//     int last = arr.length-1;
//      while(first<last)
//     {
        
//         if(arr[first] + arr[last]==k) {
//          System.out.println("Pair Found : " + arr[first] + "," + arr[last]);
//          break;
//         }
//            if(arr[first] + arr[last] < k) {
//                    first++;
//                 }
//                else if(arr[first] + arr[last] > k) {
//                    last--;
//                }       }
        
    
// }
// }
public class Pairsum3 {
    static void appraoch_3(int arr[], int k) {
       Arrays.sort(arr);
         int first = 0;
        int last = arr.length - 1;
        while(first < last) {
            if(arr[first] + arr[last] == k) {
                System.out.println("Pair Found : " + arr[first] + "," + arr[last]);
                return;
            }
            if(arr[first] + arr[last] < k) {
                first++;
            }
            else if(arr[first] + arr[last] > k) {
                last--;
            }
        }
   }
   public static void main(String[] args) {
    int arr[]={2,9,4,5,6,3,1,10,5};
    int k = 10;
    appraoch_3(arr, k);

   }
}