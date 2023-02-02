import java.lang.reflect.Array;
import java.util.Scanner;

public class EvenOdd {
    static int even(int [] array){
       int even = 0 ;
        for(int i= 0 ; i<array.length;i++){
            if(array[i]%2==0){
                even = even+ array[i];
            }  
    }
    return even;
}
    static int Odd(int[] array){
        int Odd = 0;
        for(int i = 0 ; i<array.length;i++){
            if(array[i]%2!=0){
                Odd = Odd+array[i];
            
            }
        }
        return Odd; 
    
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
        System.out.println("Sum of Even numbers:   "+even(arr));
        System.out.println("Sum of Odd numbers:    "+Odd(arr));
    }


}
