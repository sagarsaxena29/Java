
public class Multibranch {
    static void fun(int x){
        System.out.println(x);
    if(x>=3){
        return;
    }
    fun(x+1);
    fun(x+2);
    fun(x+3);
    fun(x+4);

    }
    public static void main(String[] args) {
        fun(0);
    }
}