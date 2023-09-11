package leetcode.algorithm;

import leetcode.common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-07-30 23:34
 * LastEditTime: 2022-07-30 23:34
 * Description: 110. 平衡二叉树
 */

public class P0110 {
    // code beginning
    class Solution {
        public boolean isBalanced(TreeNode root) {
            if (root == null) return true;
            return Math.abs(height(root.left) - height(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
        }

        private int height(TreeNode node) {
            if (node == null) return 0;
            return Math.max(height(node.left), height(node.right)) + 1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0110().new Solution();
        Object ans = s.isBalanced(new TreeNode("[3,9,20,null,null,15,7]"));
        System.out.println(ans);
    }
}