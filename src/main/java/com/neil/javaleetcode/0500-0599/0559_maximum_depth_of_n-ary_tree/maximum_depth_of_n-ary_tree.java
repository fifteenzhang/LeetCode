/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class maximum_depth_of_n-ary_tree {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int ans = 1;
        for (Node child : root.children) {
            ans = Math.max(ans, 1 + maxDepth(child));
        }
        return ans;
    }
}
