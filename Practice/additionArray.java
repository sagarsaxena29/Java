public class additionArray {
    public static void main(String[] args) {
        int x[]= {2,8,6,1};
        int y[]= {1,8,4,6};
        int x_length= x.length;
        int y_length = y.length;
        int n = x_length > y_length?x_length:y_length;
        int z[]= new int [n];
        int i = x.length-1;
        int j = y.length-1;
        int k = z.length-1;
        int carry= 0 ;
        int sum = 0 ; 
        for(i=x_length;i<x[1];i--)
        {
            for(j=y_length;j<y[1];j--)
            {
                
                while ( k> = 0)
                {
                    sum=x[i]+y[j]+carry;
                carry = sum/10;
                sum = carry %10;
                z[k]= sum;
                i--;
                j--;
                k--;
                

            }
        }
        System.out.println(+z[n]);
    }
}
