   import java.util.Scanner;

public class primepalindrome {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    static boolean isPalindrome(int n) {
        int r = 0, temp = n;
        while (n > 0) {
            r = r * 10 + n % 10;
            n /= 10;
        }
        return temp == r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i) && isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
