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
class kth_smallest_element_in_a_bst {
    private int k;
    private int ans;

    public int kthSmallest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return ans; 
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        if (--k == 0) {
            ans = root.val;
            return;
        }
        dfs(root.right);
    }
}
