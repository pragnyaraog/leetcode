public class ramanujannumber{
    public static void main(String[] args) {

        int limit = 20;

        for (int a = 1; a <= limit; a++) {
            for (int b = a + 1; b <= limit; b++) {

                int sum1 = a*a*a + b*b*b;

                for (int c = a + 1; c <= limit; c++) {
                    for (int d = c + 1; d <= limit; d++) {

                        int sum2 = c*c*c + d*d*d;

                        if (sum1 == sum2) {
                            System.out.println(
                                a + "^3 + " + b + "^3 = " +
                                c + "^3 + " + d + "^3 = " + sum1
                            );
                        }
                    }
                }
            }
        }
    }
}