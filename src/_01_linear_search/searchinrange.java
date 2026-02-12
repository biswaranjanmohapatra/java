package _01_linear_search;

public class searchinrange {
    public static void main(String[] args) {
       int[] arr = {2,45,6,7,8,89,70,47};
       int target = 70;
        System.out.println(searchinrng(arr,target,1,5));
    }
    static  int searchinrng(int[] arr, int target ,int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for (int i =start ; i< end;i++){
            if(arr[i]==target){
                return 1;
            }
        }
        return -1;
    }
}
