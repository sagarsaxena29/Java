import java.util.Scanner;
class Four{
    public static void main(String[] args) {
        System.out.println("enter the value");
        Scanner scanner  = new Scanner(System.in);
     int age = scanner.nextInt();
    if (age>=18)
 {System.out.println("eligible");

        
    } else {
    System.out.println("not elible ");    
    }
    scanner.close();

    }
    
}
