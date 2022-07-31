package leetcode.editor.cn.algorithm;

import leetcode.editor.cn.common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-07-31 22:06
 * LastEditTime: 2022-07-31 22:06
 * Description: 129. 求根节点到叶节点数字之和
 */

public class P0129 {
    // code beginning
    class Solution {
        public int sumNumbers(TreeNode root) {
            return dfs(root, 0);
        }

        private int dfs(TreeNode root, int sum) {
            if (root == null) return 0;
            int cur = sum * 10 + root.val;
            if (root.left == null && root.right == null) {
                return cur;
            } else {
                return dfs(root.left, cur) + dfs(root.right, cur);
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new P0129().new Solution();
        Object ans = s.sumNumbers(new TreeNode("[4,9,0,5,1]"));
        System.out.println(ans);
    }
}