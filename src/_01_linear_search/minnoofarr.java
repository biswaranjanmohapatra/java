package _01_linear_search;

public class minnoofarr {
    public static void main(String[] args) {
        int[] arr = {12,34,5,-4,-16,4,5};
        System.out.println(minarr(arr));
    }

    static int minarr(int[] arr){
        int ans = arr[0];
       for (int i = 0;i<arr.length;i++){
           if(ans > arr[i]){
               ans = arr[i];
           }
       }
       return ans;
    }
}
