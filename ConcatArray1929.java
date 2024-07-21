import java.util.ArrayList;

public class ConcatArray1929 {
    // public class concatArray {
    //     public int[] getConcatenation(int[] nums) {

    //     }
    // }
    
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(12);
        arr.add(13);
        arr.add(14);
        System.out.print(arr + " ");

        // int result[] = new int[aLen + bLen];

        // for (int element : nums) {
        //     result[pos] = element;
        //     pos++;
        // }

        System.arraycopy(args, 0, arr, 0, 0);
    }
}
