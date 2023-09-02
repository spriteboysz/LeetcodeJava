package leetcode.algorithm;

import leetcode.common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-07-22 22:36
 * LastEditTime: 2022-07-22 22:36
 * Description: 783. 二叉搜索树节点最小距离
 */

public class P0783 {
    // code beginning
    class Solution {
        int pre = Integer.MAX_VALUE, min = Integer.MAX_VALUE;

        public int minDiffInBST(TreeNode root) {
            dfs(root);
            return min;
        }

        private void dfs(TreeNode node) {
            if (node == null) return;
            dfs(node.left);
            int value = node.val;
            min = Math.min(min, Math.abs(value - pre));
            pre = value;
            dfs(node.right);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0783().new Solution();
        Object ans = s.minDiffInBST(new TreeNode("[1,0,48,null,null,12,49]"));
        System.out.println(ans);
    }
}