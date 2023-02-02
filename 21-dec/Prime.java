public class Prime {
    static boolean isprime(int n , int i){

if(n % i == 0)
{
    return false;

}
if(i == n/2){
return true;

}

return isprime(n,i+1);

    }
    public static void main(String[] args) {
        boolean result= isprime(17,2);
        System.out.println(result);
    }
}
