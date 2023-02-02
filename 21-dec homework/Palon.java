public class Palon {
    static boolean pall(int n, int result){
        int c=n;
        int sum=0;
    if(n==0){
    result=n%10;
     sum=result+(sum*10);
    n=n/10;
    }
    if (c==n)
    {
        return true;
    }
    if(c!=n){
        return false;


    }
return pall(n,n++);
}

    public static void main(String[] args) {
       boolean h= pall(113,0);
        System.out.println(h);
    }
}
