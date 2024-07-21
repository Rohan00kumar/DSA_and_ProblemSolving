// import java.util.*;

// public class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;

//     TreeNode(int val) {
//         this.val = val;
//     }
// }

// public class createBinary2196 {
//     public TreeNode createBinaryTree(int[][] descriptions) {
//         Map<Integer, TreeNode> nodes = new HashMap<>();
//         Set<Integer> children = new HashSet<>();

//         for (int[] description : descriptions) {
//             int parentVal = description[0];
//             int childVal = description[1];
//             boolean isLeft = description[2] == 1;

//             TreeNode parent = nodes.computeIfAbsent(parentVal, k -> new TreeNode(k));
//             TreeNode child = nodes.computeIfAbsent(childVal, k -> new TreeNode(k));

//             if (isLeft) {
//                 parent.left = child;
//             } else {
//                 parent.right = child;
//             }

//             children.add(childVal);
//         }

//         TreeNode root = null;
//         for (int[] description : descriptions) {
//             int parentVal = description[0];
//             if (!children.contains(parentVal)) {
//                 root = nodes.get(parentVal);
//                 break;
//             }
//         }

//         return root;
//     }

//     // Helper method to perform level order traversal to print the tree
//     public List<Integer> levelOrderTraversal(TreeNode root) {
//         List<Integer> result = new ArrayList<>();
//         if (root == null)
//             return result;

//         Queue<TreeNode> queue = new LinkedList<>();
//         queue.add(root);

//         while (!queue.isEmpty()) {
//             TreeNode node = queue.poll();
//             result.add(node.val);
//             if (node.left != null)
//                 queue.add(node.left);
//             if (node.right != null)
//                 queue.add(node.right);
//         }

//         return result;
//     }

//     public static void main(String[] args) {
//         createBinary2196 obj = new createBinary2196();
//         int[][] descriptions = new int[][] { { 20, 15, 1 }, { 20, 17, 0 }, { 50, 20, 1 }, { 50, 80, 0 },
//                 { 80, 19, 1 } };
//         TreeNode root = obj.createBinaryTree(descriptions);
//         List<Integer> result = obj.levelOrderTraversal(root);
//         System.out.println(result); // [50, 20, 80, 15, 17, 19]
//     }
// }
