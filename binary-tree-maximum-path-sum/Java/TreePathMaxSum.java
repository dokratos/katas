public class TreePathMaxSum {
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
    class Solution {
        int maxSum = -1001;


        public int maxPathSum(TreeNode root) {
            int start = root.val;
            if (root.right == null && root.left == null) return start;

            int left = root.left != null ? root.left.val : -1001;
            int right = root.right != null ? root.right.val : -1001;

            int sumLeft = start + left;
            int sumRight = start + right;
            int startTreeSum = start + left + right;

            int[] values = {start, left, right, sumLeft, sumRight, startTreeSum};


            for (int n : values) {
                maxSum = maxSum > n ? maxSum : n;
            }
//            int sum = 0;


            System.out.println(sumRight + " right");
            System.out.println(sumLeft + " left");


            return maxSum;
        }

            void findMaxSum(TreeNode node, int sum) {
                if (node == null) return;

                sum += node.val;
                if (sum > maxSum) {
                    maxSum = sum;
                }

                findMaxSum(node.left, sum);
                findMaxSum(node.right, sum);

            }
    }
}
