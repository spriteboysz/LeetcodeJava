package algorithm;

import common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Author: Deean
 * Date: 2022-07-18 23:19
 * LastEditTime: 2022-07-18 23:19
 * Description: 637. 二叉树的层平均值
 */

public class P0637 {
    // code beginning
    class Solution {
        public List<Double> averageOfLevels(TreeNode root) {
            List<Double> average = new ArrayList<>();
            if (root == null) return average;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                long level = 0;
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.poll();
                    assert node != null;
                    level += node.val;
                    if (node.left != null) queue.offer(node.left);
                    if (node.right != null) queue.offer(node.right);
                }
                average.add(level * 1.0d / size);
            }
            return average;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0637().new Solution();
        Object ans = s.averageOfLevels(new TreeNode("[3,9,20,15,7]"));
        System.out.println(ans);
        ans = s.averageOfLevels(new TreeNode("[2147483647,2147483647,2147483647]"));
        System.out.println(ans);    // [2147483647.00000,2147483647.00000]
    }
}