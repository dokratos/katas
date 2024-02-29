import java.util.ArrayDeque;
import java.util.Deque;

public class AlgoMonsterSolution {
        public boolean isEvenOddTree(TreeNode root) {
            // Tracks whether the current level is even (starting with the root level as even).
            boolean isLevelEven = true;

            // Queue for performing level order traversal
            Deque<TreeNode> queue = new ArrayDeque<>();
            queue.offer(root);

            // Loop while there are nodes in the queue
            while (!queue.isEmpty()) {
                // 'previousValue' will store the last value seen at the current level to check the strictly increasing or decreasing order.
                int previousValue = isLevelEven ? 0 : 1000001;

                // Number of nodes at the current level
                for (int levelSize = queue.size(); levelSize > 0; --levelSize) {
                    root = queue.poll();

                    // For even levels, values must be odd and strictly increasing
                    if (isLevelEven && (root.val % 2 == 0 || previousValue >= root.val)) {
                        return false;
                    }

                    // For odd levels, values must be even and strictly decreasing
                    if (!isLevelEven && (root.val % 2 == 1 || previousValue <= root.val)) {
                        return false;
                    }

                    // Update the 'previousValue' with the current node's value
                    previousValue = root.val;

                    // Add the left and right children, if they exist, to the queue for the next level
                    if (root.left != null) {
                        queue.offer(root.left);
                    }
                    if (root.right != null) {
                        queue.offer(root.right);
                    }
                }

                // Toggle the level indication for the next level traversal
                isLevelEven = !isLevelEven;
            }

            // If all levels meet the condition, return true
            return true;
        }
}
