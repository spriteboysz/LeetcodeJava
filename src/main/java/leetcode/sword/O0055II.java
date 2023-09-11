package leetcode.sword;

import leetcode.common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-07-30 23:28
 * LastEditTime: 2022-07-30 23:28
 * Description: 剑指 Offer 55 - II. 平衡二叉树
 */

public class O0055II {
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
        Solution s = new O0055II().new Solution();
        Object ans = s.isBalanced(new TreeNode("[1,2,2,3,3,null,null,4,4]"));
        System.out.println(ans);
    }
}