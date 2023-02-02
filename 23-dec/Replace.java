public class Replace {
    static String Output = "";
    static String replace(String str , int i ){
        Output = Output + str.charAt(i);
        if(i == str.length() - 1){
            return "";
        }
    if(str.charAt(i) == str.charAt(i+1)){
        Output +="*";
    }
    return replace(str , i+1);
   //else {
   // return str.charAt(i) + replace(str, i+1);
    //}
}
public static void main(String[] args) {
    String str = "abaabebba";
    replace(str , 0);
    System.out.println(Output);
}
    
}
