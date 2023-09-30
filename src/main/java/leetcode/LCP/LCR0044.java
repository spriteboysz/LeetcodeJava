package leetcode.LCP;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-29 18:05
 * FileName: src/main/java/leetcode/algorithm
 * Description:
 */

public class LCR0044 {
    // code beginning
    class Solution {
        public List<Integer> largestValues(TreeNode root) {
            List<Integer> levels = new ArrayList<>();
            if (root == null) return levels;
            Deque<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                int maximum = Integer.MIN_VALUE;
                for (int i = 0, n = queue.size(); i < n; i++) {
                    var node = queue.poll();
                    assert node != null;
                    maximum = Math.max(maximum, node.val);
                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                }
                levels.add(maximum);
            }
            return levels;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0044().new Solution();
        var ans = s.largestValues(new TreeNode("[1,3,2,5,3,null,9]"));
        System.out.println(ans);
    }
}
