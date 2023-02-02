import java.text.NumberFormat;
import java.util.Scanner;

public class BASIC{
    public static void main(String[] args) {
        final int MONTHS = 12;
        double TAX = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Basic Salary = ");
        int basic = scanner.nextInt();
        double HRA = basic * 0.50;
        double DA = basic * 0.15;
        double TA = basic * 0.40;
        double MA = basic * 0.25;
        double NS = HRA + DA + TA + MA;
        double PF = NS * 0.10;
        double GS = NS-PF;
        double AS = GS * MONTHS;
        if(AS>=500000 && AS<800000){
            TAX = 0.10;
        }
        else if(AS>=800000 && AS<1000000){
            TAX = 0.20;
        }
        else if(AS>=1000000){
            TAX = 0.30;
        }
        if(TAX>0){
            TAX = GS * TAX;
        }
        System.out.println("\n******SALARY SLIP*****\n");
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println("BASIC SALARY = "   +nf.format(basic));
        System.out.println("HRA = "     +nf.format(HRA));
        System.out.println("DA = "     +nf.format(DA));
        System.out.println("TA = "     +nf.format(TA));
        System.out.println("MA = "     +nf.format(MA));
        System.out.println("NS = "     +nf.format(NS));
        System.out.println("PF = "     +nf.format(PF));
        System.out.println("AS = "     +nf.format(AS));
        System.out.println("GS = "     +nf.format(GS));
    scanner.close();
    }
}