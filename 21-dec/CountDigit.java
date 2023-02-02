public class CountDigit {
    static int  Countdigit(int n, int count){
if( n==0){
    return count;
}
n=n/10;
count++;
return Countdigit(n,count);
}
public static void main(String[] args) {
    Countdigit(114340,0);
}}