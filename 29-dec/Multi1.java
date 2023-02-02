public class Multi1 {
    
    static void fun(int x){
    if(x > 0){
        System.out.println(x);
    fun(x-1);
    fun(x-2);
    }

    }
    public static void main(String[] args) {
        fun(3);
    }
}
