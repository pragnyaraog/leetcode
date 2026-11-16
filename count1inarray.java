public class count1inarray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5};
        int[] countArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int[] bin = new int[32];
            int index = 0;
            int n = arr[i];
            int count = 0;

            while (n > 0) {
                bin[index++] = n % 2;
                n /= 2;
            }

            for (int j = 0; j < index; j++) {
                if (bin[j] == 1) {
                    count++;
                }
            }
            countArr[i] = count; 
        }

        for (int i = 0; i < countArr.length; i++) {
            System.out.println(countArr[i]);
        }
    }
}
