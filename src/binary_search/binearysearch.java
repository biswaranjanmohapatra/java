package binary_search;

public class binearysearch {
    public static void main(String[] args) {
     int[] arr = {1,3,7,9,12,15,18,19,21,56,79,89,90,100};
     int target = 100;
     int ans = binearysrch(arr,target);
        System.out.println(ans);
    }
    static int binearysrch(int[] arr, int target){
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
        return -1;
    }
}
