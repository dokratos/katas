import java.util.ArrayDeque;
import java.util.Queue;

class QueueSolution {

    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        int bottomLeftValue = 0;

        while (!queue.isEmpty()) {
            bottomLeftValue = queue.peek().val;

            for (int i = queue.size(); i > 0; --i) {
                TreeNode node = queue.poll();

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }

        return bottomLeftValue;
    }
}
