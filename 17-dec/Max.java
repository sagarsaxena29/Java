import java.lang.reflect.Array;
import java.util.Scanner;

public class Max {
    static int max(int [] array){
       int max = 0 ;
        for(int i= 0 ; i<array.length;i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;

    }
    static int min(int[] array){
        int min = array[0];
        for(int i = 0 ; i<array.length;i++){
            if(array[i]<min){
                min = array[i];
            
            }
        }
        return min; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array range");
        int size = sc.nextInt();
        int[]arr=new int[size];
        System.out.println("enter the array element");
        for(int i = 0 ; i<size; i++){
            arr[i]=sc.nextInt();
        }
        //array m = new array();
        System.out.println("max. value: "+max(arr));
        System.out.println("min value: "+min(arr));
    }


}
