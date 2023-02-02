public class Print1to10 {
    // print 1 to 10 no.
    static void printValue(int num){
        if (num==0)
        {
            return ;
        }
        printValue(num-1);
    
    System.out.println(num);
    }
    public static void main(String[] args) {
        printValue(10);    

    }
}
