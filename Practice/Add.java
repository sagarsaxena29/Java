import java.util.Scanner;

public class Add {
    int a,b;
    void get(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter First no.");
     a = sc.nextInt();
     System.out.println("Enter Second no.");
     b = sc.nextInt();
}
void putdata()
{
    System.out.println("Addition "+(a+b));
}
public static void main(String[] args) {
Add aa = new Add();
aa.get();
aa.putdata(); //callimg
}
}
