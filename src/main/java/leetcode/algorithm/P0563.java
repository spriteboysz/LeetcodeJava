package leetcode.algorithm;

import leetcode.common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-07-22 23:13
 * LastEditTime: 2022-07-22 23:13
 * Description: 563. 二叉树的坡度
 */

public class P0563 {
    // code beginning
    class Solution {
        int tile = 0;

        public int findTilt(TreeNode root) {
            dfs(root);
            return tile;
        }

        private int dfs(TreeNode node) {
            if (node == null) return 0;
            int left = dfs(node.left);
            int right = dfs(node.right);
            tile += Math.abs(left - right);
            return left + right + node.val;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0563().new Solution();
        Object ans = s.findTilt(new TreeNode("[4,2,9,3,5,null,7]"));
        System.out.println(ans);
    }
}