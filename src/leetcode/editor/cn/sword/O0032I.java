package leetcode.editor.cn.sword;

import leetcode.editor.cn.common.TreeNode;

import java.util.*;

/**
 * Author: Deean
 * Date: 2022-07-22 21:16
 * LastEditTime: 2022-07-22 21:16
 * Description: 剑指 Offer 32 - I. 从上到下打印二叉树
 */

public class O0032I {
    // code beginning
    class Solution {
        public int[] levelOrder(TreeNode root) {
            List<Integer> level = new ArrayList<>();
            if (root == null) return new int[0];
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.poll();
                    assert node != null;
                    level.add(node.val);
                    if (node.left != null) queue.offer(node.left);
                    if (node.right != null) queue.offer(node.right);
                }
            }
            int[] values = new int[level.size()];
            for (int i = 0; i < values.length; i++) {
                values[i] = level.get(i);
            }
            return values;
        }
    }

    public static void main(String[] args) {
        Solution s = new O0032I().new Solution();
        int[] ans = s.levelOrder(new TreeNode("[3,9,20,null,null,15,7]"));
        System.out.println(Arrays.toString(ans));
    }
}