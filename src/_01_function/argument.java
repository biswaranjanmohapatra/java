package _01_function;

public class argument {
    public static void main(String[] args) {
        int ans = sum(12,23);
        System.out.println(ans);
    }
    static int sum(int a, int b){
        int sum = a + b;
        return sum;
    }
}
