import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        System.out.println("enter you class");
        String Subject = sc.next();
        System.out.println("Name is : " + name);
        System.out.println("Age is : "+ age);
        System.out.println("Class is: "+ Subject);
    
        sc.close();
    }
}
