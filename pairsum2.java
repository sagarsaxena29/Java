// import java.util.HashMap;
// public class pairsum2 {
//     static void Pair2(int arr[], int k) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for(int element : arr) {
//             if(map.get(element) == null) {
//                 map.put(k - element, element);
//             }
//             else {
//                 System.out.println("Pair Found" + map.get(element) + "," + element);
//                 return;
//             }
//         }
//     }
// public static void main(String[] args) {
//     int arr[]= {6,3,4,7,8,1,2};
//     int k= 10;
//     Pair2(arr,k) ;
//     }}
 
class Solution {
    static void twoSum(int arr[] , int target) {
        Arrays.sort(arr);         
        int first = 0;
        int last = arr.length -1;
        while(first < last){
            if(arr[first]+arr[last]==target){  
           System.out.println("Pair Found : " + first + "," + last);
          return;
            }
            if(arr[first]+arr[last]<target)
            {
                first++;
            }
             if(arr[first]+arr[last]>target){
             last--;

             }

        }
    }
     public static void main(String[] args) {
    int arr[]={2,9,4,5,6,3,1,10,5};
    int target = 10;
    twoSum(arr, target);

   }}