import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        final int MONTHS = 12;
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter the ID");
        int ID = Scanner.nextLine();
        system.out.println("Name");
        char Name = scanner.nextLine();
        system.out.println("enter the basic salary");
        double bS = scanner.nextLine();
       double HRA = bs * 50/100;
        double DA= bs * 15/100;
        double TA = bs * 40/100;
        double MA = bs *25/100;
        double PF=(HRA+DA+TA+MA*100)/100;
        double GS = bs+HRA+DA+TA+MA+PF;
        double AS = GS * MONTHS ;
        double tax = 0 ;
        if (AS>=50000 && AS<80000){
            tax = 0.10;
        }
        else if(AS>=80000 && AS<1000000){
            tax = 0.20;
        }        
        else if(AS>1000000){
            tax = 0.30;
        }
        if (tax>0)
        {
            tax = GS * tax;
        }

        system.out.println("*******Salary Slip********");
        system.out.println("Basic salary"+bS);
        scanner.close();

        }
}
