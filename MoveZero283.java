public class MoveZero283 {
        public void moveZeroes(int[] nums) {
            int pos = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[pos++] = nums[i];
                }
            }
            for (int i = pos; i < nums.length; i++) {
                nums[i] = 0;
            }
        }

        public static void main(String[] args) {
            MoveZero283 moveZero283 = new MoveZero283();
            int[] nums = {0, 1, 0, 3, 12};
            moveZero283.moveZeroes(nums);
            for (int num : nums) {
                System.out.print(num + " ");
            }
        
    }
}
