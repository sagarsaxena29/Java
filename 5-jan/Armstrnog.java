public class Armstrnog {
    static int arm(int num , int b)
    {
    int copy=num;
    if(num>0){
     b=num%10;
    b=b*b*b; 
    num=num/10;
    arm(num,b);
}
    if(copy==b){
        System.out.println("num is arm");
    }

    return 0;
}
public static void main(String[] args) {
    arm(15, 0);
}
}
