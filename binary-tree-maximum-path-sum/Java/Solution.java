public class Solution {
        int maxSum = -1001;

        public int maxPathSum(TreeNode root) {
            findMaxSum(root);
            return maxSum;
        }

        int findMaxSum(TreeNode node) {
            if (node == null) return 0;

            int rightSum = Math.max(0, findMaxSum(node.right));
            int leftSum = Math.max(0, findMaxSum(node.left));

            maxSum = Math.max((node.val + leftSum + rightSum), maxSum);

            return Math.max((rightSum+node.val), (leftSum+node.val));
        }
}
