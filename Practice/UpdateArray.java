
public class UpdateArray {
 
        int currentSize;
        int arr[];
        int i;
        // Constructor
        UpdateArray (int capacity) {
            this.arr = new int[capacity];
            currentSize = 0;
        }
    
        void insert(int index, int data) {       // Function for input
              arr[index]=data;
            if(index > currentSize) {
                System.out.println("Index cannot be greater than current Size...");
                return;
            }
    
            if(currentSize == arr.length) {
                System.out.println("Array is full...Can't add more elements...");
                return;
            }
    
            System.out.println("Element Updates...");
           }
            void update(int index, int data) {
                arr[index]=data;
                for(int i=0;i<arr.length-1;i++){
                System.out.println(+arr[i]);
                }
            }
            void read() {
                for(int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + ", ");
                }
                System.out.println();
            }
            void searching(int data) {

                for(int i = 0; i < arr.length; i++) 
                if(arr[i]== data){
                    System.out.print(i+ ", ");

                }                   
                
                System.out.println();}
            
    
  public static void main(String[] args) {
    UpdateArray obj = new UpdateArray(8);
    obj.insert(0, 10);
    obj.insert(1, 20);
    obj.insert(2, 11);
    obj.insert(3, 7);
    obj.insert(4, 17);
    //obj.update(2, 9);
    obj.read();
    obj.searching(11);
}
}

