public class Maxelement{
static void secondMax(int arr[], int n){
    int max =arr[0];
for(int i=0;i<n;i++){
    if (arr[i]>max){
        max=arr[i];
    }
}
 int secondMax= arr[0];
for(int i=0;i<n;i++){
    if(arr[i]!=max){
       if(arr[i]>secondMax){

        secondMax =arr[i];
       }}}
       int thirdMax= arr[0];
       for(int i=0;i<n;i++)
       {
        if(arr[i]!=secondMax)
        {
            thirdMax=arr[i];
        }
       }
       System.out.println(+thirdMax);
    }
    

public static void main(String[] args) {
    int arr[]={3,3,56,58,5,4,3,7};
    int n = arr.length;
    secondMax(arr, n);
}}