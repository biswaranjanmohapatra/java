package binary_search;

public class orderbinarysearch {

    public static void main(String[] args) {

        //  Ascending array
        // int[] arr = {1,3,7,9,12,15,18,19,21,56,79,89,90,100};

        //  Descending array
        int[] arr = {100,90,89,79,56,21,19,18,15,12,9,7,3,1};

        int target = 18;

        int ans = binarySearch(arr, target);
        System.out.println("Index of target: " + ans);
    }

    static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        // Check if array is ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                // Ascending order
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                // Descending order
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1; // Target not found
    }
}
