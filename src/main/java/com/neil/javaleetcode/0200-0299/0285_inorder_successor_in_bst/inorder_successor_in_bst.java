/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class inorder_successor_in_bst {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode cur = root, ans = null;
        while (cur != null) {
            if (cur.val <= p.val) {
                cur = cur.right;
            } else {
                ans = cur;
                cur = cur.left;
            }
        }
        return ans;
    }
}
