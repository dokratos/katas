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

    int count = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        incrementCount(root);
        return count;
    }

    int incrementCount(TreeNode node) {
        if (node == null) {
            return 0;
        }

        count++;

        return Math.max(incrementCount(node.right), incrementCount(node.left));
    }
}

