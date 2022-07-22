package leetcode.editor.cn.algorithm;

import leetcode.editor.cn.common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-07-22 22:20
 * LastEditTime: 2022-07-22 22:20
 * Description: 530. 二叉搜索树的最小绝对差
 */

public class P0530 {
    // code beginning
    class Solution {
        int pre = Integer.MAX_VALUE, min = Integer.MAX_VALUE;

        public int getMinimumDifference(TreeNode root) {
            dfs(root);
            return min;
        }

        private void dfs(TreeNode node) {
            if (node == null) return;
            dfs(node.left);
            int cur = node.val;
            min = Math.min(min, Math.abs(cur - pre));
            pre = cur;
            dfs(node.right);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0530().new Solution();
        //Object ans = s.getMinimumDifference(new TreeNode("[1,0,48,null,null,12,49]"));
        //System.out.println(ans);
        Object ans = s.getMinimumDifference(new TreeNode("[1564,1434,3048,1,null,null,3184]"));
        System.out.println(ans);
    }
}