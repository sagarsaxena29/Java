public class Print {
 
    static int  Countdigit(int n, int count){
    if( n==0){
        return count;
    }
    count=count+n ; 
    //count++ ;
    n--;
    return Countdigit(n,count);
    }
    public static void main(String[] args) {
       int h= Countdigit(10,0);
       System.out.println(h);
    }}

