public class Lcm {
    public static void main(String[] args) {
        int a = 2, b = 3;
        int x = a, y = b;

        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        int gcd = a;
        int lcm = (x * y) / gcd;

        System.out.println("LCM is: " + lcm);
    }
}
