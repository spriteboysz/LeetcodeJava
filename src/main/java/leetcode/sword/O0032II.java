package leetcode.sword;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Author: Deean
 * Date: 2022-07-22 21:39
 * LastEditTime: 2022-07-22 21:39
 * Description: 剑指 Offer 32 - II. 从上到下打印二叉树 II
 */

public class O0032II {
    // code beginning
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> levels = new ArrayList<>();
            if (root == null) return levels;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                List<Integer> level = new ArrayList<>();
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.poll();
                    assert node != null;
                    level.add(node.val);
                    if (node.left != null) queue.offer(node.left);
                    if (node.right != null) queue.offer(node.right);
                }
                levels.add(level);
            }
            return levels;
        }
    }

    public static void main(String[] args) {
        Solution s = new O0032II().new Solution();
        Object ans = s.levelOrder(new TreeNode("[3,9,20,null,null,15,7]"));
        System.out.println(ans);
    }
}