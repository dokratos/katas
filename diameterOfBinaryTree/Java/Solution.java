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

        int leftCount = Math.max(0, incrementCount(node.left));
        int rightCount = Math.max(0, incrementCount(node.right));

        count = Math.max((leftCount + rightCount), count);

        return Math.max(leftCount+1, rightCount+1);
    }

// this code counts all nodes!
//    int incrementCount(TreeNode node) {
//        if (node == null) {
//            return 0;
//        }
//
//        count++;
//
//        return Math.max(incrementCount(node.right), incrementCount(node.left));
//    }
}

