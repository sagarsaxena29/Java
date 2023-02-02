public class Reverse {
public static void main(String[] args) {

    int arr[]={8,5,7,10,20,11,4};
    int n = arr.length;
    int i = 0;
    int j = n-1;
    while (i<j)
    {
        int temp = arr[i];
        arr[j]= temp;
        i++;
        j--;
    
    }


for(int k = 0; k<n;k++){
    System.out.println(arr[k]+" ");
}
}}
