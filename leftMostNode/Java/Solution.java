
class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    int leftMost = -2147483648;
    int longestBranch = 0;

    public int findBottomLeftValue(TreeNode root) {
        maxDepth(root);
        return longestBranch;
    }


    int maxDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftDepth = maxDepth(node.left);
        int rightDepth = maxDepth(node.right);


        longestBranch = 1 + Math.max(leftDepth, rightDepth);
        return longestBranch;
    }
}
