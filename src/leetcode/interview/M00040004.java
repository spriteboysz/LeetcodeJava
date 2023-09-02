package leetcode.interview;

import leetcode.common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-07-30 23:39
 * LastEditTime: 2022-07-30 23:39
 * Description: 面试题 04.04. 检查平衡性
 */

public class M00040004 {
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
        Solution s = new M00040004().new Solution();
        Object ans = s.isBalanced(new TreeNode("[1,2,2,3,3,null,null,4,4]"));
        System.out.println(ans);
    }
}