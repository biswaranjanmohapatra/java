package _01_array;

public class maxvalue {
   public static void main(String[] args) {
        int[] arr = {1,45,7,18,10,30};
       System.out.println(max(arr));
    }
    static int max(int[] arr){
       int maxval= arr[0];
       for (int i= 0 ;i<arr.length;i++){
           if(arr[i]> maxval){
               maxval = arr[i];
           }
       }
        return maxval;
    }

}
