package _01_linear_search;

public class stringsearch {
   public static void main(String[] args) {
        String str = "Rahul";
        char ch = 'm';
        boolean ans = stringsearch(str,ch);
       System.out.println(ans);
    }
    static boolean stringsearch(String str , char target){
       if(str.length() == 0){
           return false;
       }
       for(int i = 0; i<str.length();i++){
           if(target == str.charAt(i)){
               return true;
           }
       }
       return false;
    }
}
