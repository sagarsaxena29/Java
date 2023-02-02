
public class Climb {
    static int climbStairs(int n) {
        if (n==1 || n == 0){
            return 1;
        } 
        else if (n == 2){
            return 2;
        }
        else{
            int x = climbStairs(n-2);
            int y = climbStairs(n-1);
            return x+y;
        }
     }
public static void main(String[] args) {
    System.out.println(climbStairs(5));  
}       
}
