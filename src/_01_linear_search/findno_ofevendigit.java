package _01_linear_search;

public class findno_ofevendigit {
    public static void main(String[] args) {
        int[] arr = {1, 23, 45, 567, 123, 56, 456};

        System.out.println(findnoofdigits(arr));
    }

    static int findnoofdigits(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }

        return count;
    }

    static boolean even(int num) {
        int noofdigits = digit(num);
        return noofdigits % 2 == 0;
    }

    static int digit(int num) {
        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }

        return count;
    }
}
