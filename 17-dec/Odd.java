import javax.lang.model.element.Element;
import java.util.Scanner;

public class Odd {
    static int even(int [] array ){
        int even =0;
        for(int i= 0 ; i<array.length;i++){
           
            if(array[i] % 2 == 0){  
            even = even+array[i];
            
        }}
        return even;
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
        System.out.println("even no. are : " +even(arr));
        System.out.println("odd no. are :   " +Odd(arr));
    
}
}