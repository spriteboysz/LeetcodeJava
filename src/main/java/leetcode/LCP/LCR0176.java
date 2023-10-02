package leetcode.LCP;

import leetcode.common.TreeNode;

/**
 * Author: Deean
 * Date: 2023-10-01 19:37
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 176. 判断是否为平衡二叉树
 */

public class LCR0176 {
    // code beginning
    class Solution {
        private int height(TreeNode root) {
            if (root == null) return 0;
            return Math.max(height(root.left), height(root.right)) + 1;
        }

        public boolean isBalanced(TreeNode root) {
            if (root == null) return true;
            return Math.abs(height(root.left) - height(root.right)) <= 1 &&
                    isBalanced(root.left) &&
                    isBalanced(root.right);
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0176().new Solution();
        var ans = s.isBalanced(new TreeNode("[3,9,20,null,null,15,7]"));
        System.out.println(ans);
    }
}
