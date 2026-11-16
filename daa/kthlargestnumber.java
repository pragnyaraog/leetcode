public import java.util.*;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        // Sort array (ascending)
        Arrays.sort(arr);

        // k-th largest
        int result = arr[n - k];

        System.out.println(result);

        sc.close();
    {
    }
}
