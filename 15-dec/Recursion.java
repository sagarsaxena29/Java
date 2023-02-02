public class Recursion {
     static void show(int num)
    {
        if(num>5){
            return ;
        }
        //show();
        System.out.println("sagar saxena"); // logic
        show(num+1); // cycle
    }
    public static void main(String[] args) {
        show(1);
    }
}