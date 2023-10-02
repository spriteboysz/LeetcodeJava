package leetcode.LCP;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-30 15:34
 * FileName: src/main/java/leetcode/algorithm
 * Description:LCR 150. 彩灯装饰记录 II
 */

public class LCR0150 {
    // code beginning
    class Solution {
        public List<List<Integer>> decorateRecord(TreeNode root) {
            List<List<Integer>> levels = new ArrayList<>();
            if (root == null) return levels;
            Deque<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                List<Integer> level = new ArrayList<>();
                for (int i = 0, n = queue.size(); i < n; i++) {
                    var node = queue.poll();
                    assert node != null;
                    level.add(node.val);
                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                }
                levels.add(level);
            }
            return levels;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0150().new Solution();
        var ans = s.decorateRecord(new TreeNode("[8,17,21,18,null,null,6]"));
        System.out.println(ans);
    }
}
