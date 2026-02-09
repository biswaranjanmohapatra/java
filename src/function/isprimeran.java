package function;

public class isprimeran {

    public static boolean isprime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void PrimeInRang(int n) {
        for (int i = 2; i <= n; i++) {
            if (isprime(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        PrimeInRang(20);
    }
}


