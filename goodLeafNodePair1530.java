// public class goodLeafNodePair1530 {
//     public int countPairs(TreeNode root, int distance) {
//         int[] count = new int[1];
//         dfs(root, distance, count);
//         return count[0];
//     }

//     private List<Integer> dfs(TreeNode root, int distance, int[] count) {
//         if (root == null) {
//             return new ArrayList<>();
//         }

//         if (root.left == null && root.right == null) {
//             List<Integer> leaf = new ArrayList<>();
//             leaf.add(1);
//             return leaf;
//         }

//         List<Integer> left = dfs(root.left, distance, count);
//         List<Integer> right = dfs(root.right, distance, count);

//         for (int l : left) {
//             for (int r : right) {
//                 if (l + r <= distance) {
//                     count[0]++;
//                 }
//             }
//         }

//         List<Integer> result = new ArrayList<>();
//         for (int l : left) {
//             if (l + 1 < distance) {
//                 result.add(l + 1);
//             }
//         }

//         for (int r : right) {
//             if (r + 1 < distance) {
//                 result.add(r + 1);
//             }
//         }

//         return result;
//     }
// }
