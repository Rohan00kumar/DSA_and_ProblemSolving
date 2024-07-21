// public class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;

//     TreeNode() {
//     }

//     TreeNode(int val) {
//         this.val = val;
//     }

//     TreeNode(int val, TreeNode left, TreeNode right) {
//         this.val = val;
//         this.left = left;
//         this.right = right;
//     }
// }

// public class directionBST2096 {
//     // Helper function to find the path from root to the given value
//     private String findPath(TreeNode root, int value) {
//         if (root == null) {
//             return null;
//         }
//         if (root.val == value) {
//             return "";
//         }
//         if (value < root.val) {
//             String leftPath = findPath(root.left, value);
//             if (leftPath != null) {
//                 return "L" + leftPath;
//             }
//         } else {
//             String rightPath = findPath(root.right, value);
//             if (rightPath != null) {
//                 return "R" + rightPath;
//             }
//         }
//         return null;
//     }

//     // Helper function to find the lowest common ancestor (LCA) of two values in BST
//     private TreeNode findLCA(TreeNode root, int startValue, int destValue) {
//         if (root == null) {
//             return null;
//         }
//         if (root.val > startValue && root.val > destValue) {
//             return findLCA(root.left, startValue, destValue);
//         }
//         if (root.val < startValue && root.val < destValue) {
//             return findLCA(root.right, startValue, destValue);
//         }
//         return root;
//     }

//     public String getDirections(TreeNode root, int startValue, int destValue) {
//         TreeNode lca = findLCA(root, startValue, destValue);
//         String pathToStart = findPath(lca, startValue);
//         String pathToDest = findPath(lca, destValue);

//         if (pathToStart == null || pathToDest == null) {
//             return "";
//         }

//         // Convert the path to start into 'U's
//         StringBuilder pathUp = new StringBuilder();
//         for (int i = 0; i < pathToStart.length(); i++) {
//             pathUp.append('U');
//         }

//         return pathUp.toString() + pathToDest;
//     }

//     public static void main(String[] args) {
//         TreeNode root = new TreeNode(5);
//         root.left = new TreeNode(3);
//         root.right = new TreeNode(7);
//         root.left.left = new TreeNode(2);
//         root.left.right = new TreeNode(4);
//         root.right.left = new TreeNode(6);
//         root.right.right = new TreeNode(8);

//         directionBST2096 obj = new directionBST2096();
//         System.out.println(obj.getDirections(root, 2, 8)); // UURLR
//     }
// }
