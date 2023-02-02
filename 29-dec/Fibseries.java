public class Fibseries {
    static int fib(int n ){
        if(n <= 1){
        return n;
        }
        int first = fib(n -1);
        int second = fib(n -2);
        int result = first + second;
       // first=second;
       // second=result;
        return result;
    }
    public static void main(String[] args) {
       System.out.println(fib(4));
    }
}

