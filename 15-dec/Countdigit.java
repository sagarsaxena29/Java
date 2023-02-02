import java.net.SocketPermission;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Countdigit {
    static countDigit(int num, int count)
    {
        if(num==0){
            System.out.println(count);
            return;
        }
        countDigit(num/10, count+1);
    }
    
    public static void main(String[] args) {
        countDigit();
    }
}
