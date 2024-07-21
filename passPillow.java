/**
 * passPillow
 */
public class passPillow {

    int n = 4;
    int k = 5;

    public int passPillow2(int n, int k) {

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        int index = 0;
        while (n > 1) {
            index = (index + k - 1) % n;
            for (int i = index; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;
        }
        return arr[0];
    }

    public static void main(String[] args) {

        passPillow pp = new passPillow();
        System.out.println(pp.passPillow2(pp.n, pp.k));
    }
}