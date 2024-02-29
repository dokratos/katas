import java.util.*;

class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    TreeMap<Integer, List<Integer>> map = new TreeMap<>();

    public boolean isEvenOddTree(TreeNode root) {
        mapTree(root, 0);

        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {

            if (entry.getKey() % 2 == 0) {
                if (entry.getValue().get(entry.getValue().size() - 1) % 2 == 0) {
                    return false;
                }
                for (int i = 0, j = i + 1; j < entry.getValue().size(); i++, j++) {
                    if (entry.getValue().get(i) % 2 == 0 ||
                            entry.getValue().get(i) >= entry.getValue().get(j)) {
                        return false;
                    }
                }
            }
            if (entry.getKey() % 2 != 0) {
                if (entry.getValue().get(entry.getValue().size() - 1) % 2 != 0) {
                    return false;
                }
                for (int i = 0, j = i + 1; j < entry.getValue().size(); i++, j++) {
                    if (entry.getValue().get(i) % 2 != 0 ||
                            entry.getValue().get(i) <= entry.getValue().get(j)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    void mapTree(TreeNode node, int depth) {
        if (node == null) return;

        map.computeIfAbsent(depth, k -> new ArrayList<>()).add(node.val);
        mapTree(node.left, depth + 1);
        mapTree(node.right, depth + 1);
    }
}
