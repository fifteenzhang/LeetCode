/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class check_if_a_string_is_a_valid_sequence_from_root_to_leaves_path_in_a_binary_tree {
    private int[] arr;

    public boolean isValidSequence(TreeNode root, int[] arr) {
        this.arr = arr;
        return dfs(root, 0);
    }

    private boolean dfs(TreeNode root, int u) {
        if (root == null || root.val != arr[u]) {
            return false;
        }
        if (u == arr.length - 1) {
            return root.left == null && root.right == null;
        }
        return dfs(root.left, u + 1) || dfs(root.right, u + 1);
    }
}
