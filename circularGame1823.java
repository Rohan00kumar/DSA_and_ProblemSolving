public class circularGame1823 {
    public static int findTheWinner(int n, int k) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res = (res + k) % i;
        }
        return res + 1;
    }
    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        System.out.println(findTheWinner(n, k));
    }
}
