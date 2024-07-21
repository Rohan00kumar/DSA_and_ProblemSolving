// import java.util.List;

// public class s3um15 {
//     public List<List<Integer>> threeSum(int[] nums) {
//         return null;
//     }

//     public List<List<Integer>> threeSum(int[] nums) {
//         List<List<Integer>> res = new ArrayList<>();
//         Arrays.sort(nums);
//         int n = nums.length;
//         for (int i = 0; i < n; i++) {
//             if (i > 0 && nums[i] == nums[i - 1])
//                 continue;
//             int target = -nums[i];
//             int j = i + 1, k = n - 1;
//             while (j < k) {
//                 if (nums[j] + nums[k] == target) {
//                     res.add(Arrays.asList(nums[i], nums[j], nums[k]));
//                     j++;
//                     k--;
//                     while (j < k && nums[j] == nums[j - 1])
//                         j++;
//                     while (j < k && nums[k] == nums[k + 1])
//                         k--;
//                 } else if (nums[j] + nums[k] < target) {
//                     j++;
//                 } else {
//                     k--;
//                 }
//             }
//         }
//         return res;
//     }

//     public static void main(String[] args) {
//         s3um15 obj = new s3um15();
//         int[] nums = {-1, 0, 1, 2, -1, -4};
//         System.out.println(obj.threeSum(nums)); // [[-1,-1,2],[-1,0,1]]
//     }
// }
