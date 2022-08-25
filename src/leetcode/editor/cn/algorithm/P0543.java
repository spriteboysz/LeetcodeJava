package leetcode.editor.cn.algorithm;

import leetcode.editor.cn.common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-08-25 22:59
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 543. 二叉树的直径
 */

public class P0543 {
    // code beginning
    class Solution {
        int diameter = 1;

        public int diameterOfBinaryTree(TreeNode root) {
            dfs(root);
            return diameter - 1;
        }

        private int dfs(TreeNode root) {
            if (root == null) return 0;
            int left = dfs(root.left);
            int right = dfs(root.right);
            diameter = Math.max(diameter, left + right + 1);
            return Math.max(left, right) + 1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0543().new Solution();
        Object ans = s.diameterOfBinaryTree(new TreeNode("[1,2,3,4,5]"));
        System.out.println(ans);
    }
}