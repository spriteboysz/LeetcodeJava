package leetcode.editor.cn.algorithm;

import leetcode.editor.cn.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Author: Deean
 * Date: 2022-07-22 21:53
 * LastEditTime: 2022-07-22 21:53
 * Description: 515. 在每个树行中找最大值
 */

public class P0515 {
    // code beginning
    class Solution {
        public List<Integer> largestValues(TreeNode root) {
            List<Integer> max = new ArrayList<>();
            if (root == null) return max;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                int level = Integer.MIN_VALUE, size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.poll();
                    assert node != null;
                    level = Math.max(level, node.val);
                    if (node.left != null) queue.offer(node.left);
                    if (node.right != null) queue.offer(node.right);
                }
                max.add(level);
            }
            return max;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0515().new Solution();
        Object ans = s.largestValues(new TreeNode("[1,2,3]"));
        System.out.println(ans);
    }
}