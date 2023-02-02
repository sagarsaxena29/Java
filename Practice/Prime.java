import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter no. for chechking no. is prime or not");
        int Num = sc.nextInt();
        int count = 0 ;
        for(int i = 2 ; i<Num; i++) 
        {
            if (Num%i==0)
            count++;
        
        }
        if(Num == 1 )
        System.out.println("No is not primme no.");
        if (count>0)
        System.out.println("No. is not prime  ");
        else 
        System.out.println("No. is Prime");
        }
}