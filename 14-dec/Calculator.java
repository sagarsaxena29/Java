import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int ch;
        int result=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first no .");

        int snum=scanner.nextInt();
        System.out.println(" Enter Second no.");
        int fnum=scanner.nextInt();
        ch=scanner.nextInt();


        System.out.println("1. Addition");
        System.out.println("2.Sub.");
        System.out.println("3.Mul");
        System.out.println("4.Div");
        switch (ch){
        case 1:
        result= fnum+snum;
        break;
        case 2:
        result= fnum-snum;
        break;
        default:
        System.out.println("Invalid");
        break;
        System.out.println(" ch");


        }
    }
}
