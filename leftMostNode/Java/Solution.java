import java.util.*;
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

    int longestBranch = 0;
    TreeMap<Integer, List<Integer>> map = new TreeMap<>();

    public int findBottomLeftValue(TreeNode root) {
        maxDepth(root);
        return map.lastEntry().getValue().get(0);
    }

    int maxDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftDepth = maxDepth(node.left);
        int rightDepth = maxDepth(node.right);

        longestBranch = 1 + Math.max(leftDepth, rightDepth);
        map.computeIfAbsent(longestBranch, k -> new ArrayList<Integer>()).add(node.val);

        return longestBranch;
    }
}
