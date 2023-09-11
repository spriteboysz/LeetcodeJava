package leetcode.algorithm;

import leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Author: Deean
 * Date: 2022-07-18 23:31
 * LastEditTime: 2022-07-18 23:31
 * Description: 1161. 最大层内元素和
 */

public class P1161 {
    // code beginning
    class Solution {
        public int maxLevelSum(TreeNode root) {
            if (root == null) return 0;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            int max = Integer.MIN_VALUE, maxLevel = 0, level = 1;
            while (!queue.isEmpty()) {
                int sum = 0, size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.poll();
                    assert node != null;
                    sum += node.val;
                    if (node.left != null) queue.offer(node.left);
                    if (node.right != null) queue.offer(node.right);
                }
                if (sum > max) {
                    max = sum;
                    maxLevel = level;
                }
                level++;
            }
            return maxLevel;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1161().new Solution();
        Object ans = s.maxLevelSum(new TreeNode("[989,null,10250,98693,-89388,null,null,null,-32127]"));
        System.out.println(ans);
    }
}