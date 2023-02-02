// public class Sagar {
//     public static void main(String[] args) {
//         int arr[]= {3,5,6,7,8,9};
//         int j=arr.length-1;
//         for(int i =0;i<j ;i++)
//         {
//             int temp = arr[j];
//             arr[j]= arr[i];
//             arr[i] = temp;
//             j--;

//         }
//         for(int k = 0 ; k<arr.length;k++)
//         {
//         System.out.print(arr[k]+" ");
//         }
//     }
// }
 public class Sagar {
    public static void main(String[] args) {

int arr[]= {6,3,4,7,8,1,2};
int k= 10;
int sum = 0;
for (int i = 0;i<arr.length;i++){
    for(int j=i+1;j<arr.length;j++)
    {
        sum = arr[i]+arr[j];
        if(sum==k)
        {
            System.out.println("pair found "+arr[i] +"+" +arr[j]);
        } 
    }
} 
}}