package _01_linear_search;

public class linearsearch {
    public static void main(String[] args) {
        int[] nums = {45, 7, 10, 18, 30, 17};
        int target = 7;

        int ans = linerasearch(nums, target);
        System.out.println(ans);
    }

    static int linerasearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

//        for (int i = 0; i < arr.length; i++) {
//            int element = arr[i];
//            if (element == target)  {
//                return i;
//            }
//        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target)  {
                return element;
            }
        }

        return -1;
    }
}
