package daa;

public class week4q4 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        // sort
        Arrays.sort(a);

        // print sorted array
        for(int i = 0; i < n; i++)
            System.out.print(a[i] + " ");

        // find median
        double median;
        if(n % 2 == 1)
            median = a[n/2];
        else
            median = (a[n/2] + a[n/2 - 1]) / 2.0;

        System.out.printf(" %.1f", median);
    }
}