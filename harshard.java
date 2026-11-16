public class harshard{
    public static void main(String[] args){
        int x = 18;
        int sum = 0, n = x;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        if (x % sum == 0) {
            System.out.println(sum);
        }
        System.out.println(-1);
    }
}
