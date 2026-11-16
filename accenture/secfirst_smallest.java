package accenture;

public class secfirst_smallest {
    public static int ProductSmallestPair(int sum, int[] arr) {
        if (arr == null || arr.length < 2)
            return -1;

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < first) {
                second = first;
                first = num;
            } else if (num < second) {
                second = num;
            }
        }

        if (first + second <= sum)
            return first * second;

        return 0;
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 2, 4, 3, 9, 7, 1};
        System.out.println(ProductSmallestPair(9, arr1)); // 2

        int[] arr2 = {9, 8, 3, -7, 3, 9};
        System.out.println(ProductSmallestPair(4, arr2)); // -21
    }
}
