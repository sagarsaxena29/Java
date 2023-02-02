import java.util.Scanner;

public class Demo {
    static int countDigit(int num , int count){
        if(num==0){
            return count;
        }
       int r= countDigit(num/10 , count + 1);
       return r;
    } 

public static void main(String[] args) {
   int e=  countDigit(76543, 0);
   System.out.println("enter any no.");
   Scanner scanner=new Scanner(null)
   System.out.println(e);
}

    }
    
