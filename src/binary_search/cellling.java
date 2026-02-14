package binary_search;

public class cellling {
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,14,15,16,17,19,90,100};
        int target = 18;
        int ans = celling(arr,target);
        System.out.println(ans);
    }
    static int celling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (end >= start){
            int mid = start + (end - start) / 2;
            if(arr[mid] > target){
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return start;
    }
}
