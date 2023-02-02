public class Pairsum {
    public static void main(String[] args) {
        int arr[]={3,9,4,2,1,10,5};
        int k = 7;
        int sum = 0 ;
        for(int  i =0; i<arr.length;i++)
        {
            for(int j =i+1 ; j<arr.length;i++)
            {
                sum = arr[i] + arr[j];
                if(sum == k)
                {
                    System.out.println(+arr[i]+ "," +arr[j]);

                }
            }
        }
    }
}
