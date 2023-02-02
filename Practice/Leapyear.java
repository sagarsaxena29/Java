import java.util.Scanner;

public class Leapyear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the year: ");
        int year = sc.nextInt();
        if (year%4 ==0)
            System.out.println("This year is a leap year");
        
        else
        System.out.println("this year is not a leap year");
    }

}