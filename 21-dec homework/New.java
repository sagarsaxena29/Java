public class New {
    static int pall(int n, int temp){
        
        if(n==0)
            return temp;
         temp=(temp*10)+(n%10);
        
        
        return pall(n/10,temp);
    
    
    }
        public static void main(String[] args) {
    
           int n=121;
           int temp = pall(n,0);
           if (temp==n)
            System.out.println("yes");
           else
            System.out.println("no");
           
        }
    
}
