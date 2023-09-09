package leetcode.algorithm;

import leetcode.common.TreeNode;

import java.util.*;

/**
 * Author: Deean
 * Date: 2023-09-07 23:28
 * FileName: src/leetcode/algorithm
 * Description:2583. 二叉树中的第 K 大层和
 */

public class P2583 {
    // code beginning
    class Solution {
        public long kthLargestLevelSum(TreeNode root, int k) {
            List<Long> levels = new ArrayList<>();
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                long level = 0;
                for (int i = 0, n = queue.size(); i < n; i++) {
                    TreeNode node = queue.poll();
                    assert node != null;
                    level += node.val;
                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }
                levels.add(level);
            }
            int n = levels.size();
            if (k > n) return -1;
            levels.sort(Comparator.reverseOrder());
            return levels.get(k - 1);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode("[5,8,9,2,1,3,7,4,6]");
        Solution s = new P2583().new Solution();
        Object ans = s.kthLargestLevelSum(root, 2);
        System.out.println(ans);
    }
}
