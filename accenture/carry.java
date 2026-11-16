package accenture;

public class carry {
    public static int NumberOfCarries(int num1, int num2) {
        int carry = 0;
        int count = 0;

        while (num1 > 0 || num2 > 0) {
            int d1 = num1 % 10;
            int d2 = num2 % 10;

            int sum = d1 + d2 + carry;

            if (sum >= 10) {
                count++;
                carry = 1;
            } else {
                carry = 0;
            }

            num1 /= 10;
            num2 /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(NumberOfCarries(451, 349)); // 2
        System.out.println(NumberOfCarries(23, 563));  // 0
        System.out.println(NumberOfCarries(999, 1));   // 3
    }
}

