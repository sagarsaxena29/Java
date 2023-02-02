import java.util.ArrayList;

public class Permutation {
    static ArrayList<String> permutation(String str){
        if (str.length() == 0 ){
            ArrayList<String> empty = new ArrayList<>();
                        empty.add("");
                        return empty;
                    
        }
        char currentchar = str.charAt(0);
        String remString = str.substring(1);
        ArrayList<String> temp = permutation(remString);
        for(String s : temp){
            
        }
   }
   public static void main(String[] args) {
    permutation("abc");
   }
}
