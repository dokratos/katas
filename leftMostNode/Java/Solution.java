class Solution {

//    int longestBranch = 0;
//
//    public int findBottomLeftValue(TreeNode root) {
//        maxDepth(root);
//        return longestBranch;
//    }
//
//
//    int maxDepth(TreeNode node) {
//        if (node == null) {
//            return 0;
//        }
//
//        int leftDepth = maxDepth(node.left);
//        int rightDepth = maxDepth(node.right);
//
//
//        longestBranch = 1 + Math.max(leftDepth, rightDepth);
//        return longestBranch;
//    }


    int leftMost = 0;
    int maxDepth = -1;

    void measureTree(TreeNode root, int depth) {
        if (root == null) return;

        if (depth > maxDepth) {
            leftMost = root.val;
            maxDepth = depth;
        }
        measureTree(root.left, depth+1);
        measureTree(root.right, depth+1);
    }

    public int findBottomLeftValue(TreeNode root) {
        measureTree(root, 0);
        return leftMost;
    }
}
