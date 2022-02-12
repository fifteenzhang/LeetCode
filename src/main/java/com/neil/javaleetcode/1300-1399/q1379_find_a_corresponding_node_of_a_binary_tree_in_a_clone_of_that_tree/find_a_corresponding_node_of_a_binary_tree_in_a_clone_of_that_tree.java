/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class find_a_corresponding_node_of_a_binary_tree_in_a_clone_of_that_tree {
    private TreeNode res;

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        dfs(original, cloned, target);
        return res;
    }

    private void dfs(TreeNode original, TreeNode cloned, TreeNode target) {
        if (cloned == null) {
            return;
        }
        if (original == target) {
            res = cloned;
            return;
        }
        dfs(original.left, cloned.left, target);
        dfs(original.right, cloned.right, target);
    }
}
