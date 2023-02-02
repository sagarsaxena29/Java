public class Pattern{
static void Patt(int x, int k){
    if (x==0){
        return;
}
System.out.println("*");
Patt(x-1,k);
}
//static void Patt2(int j){
 //   if (j==0){
//        return;
//}
//System.out.println("*");
//}

public static void main(String[] args) {
 Patt(5,5);
}}