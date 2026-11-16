public class binaryarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            int[] bin = new int[32];
            int index = 0;
            while (n > 0) {
                bin[index++] = n % 2;
                n /= 2;
            }

            System.out.print(arr[i] + " -> ");
            for (int j = index - 1; j >= 0; j--) {
                System.out.print(bin[j]);
            }
            System.out.println();
        }
    }
}
