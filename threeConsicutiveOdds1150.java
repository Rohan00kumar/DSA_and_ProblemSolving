/**
 * threeconsicutiveOdds1150
 */
public class threeConsicutiveOdds1150 {
    public static boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                count++;
                if (count == 3) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 4, 1 };
        System.out.println(threeConsecutiveOdds(arr));
    }
   
}