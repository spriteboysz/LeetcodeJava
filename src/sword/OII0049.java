package sword;

import common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-08-07 17:36
 * Description: 剑指 Offer II 049. 从根节点到叶节点的路径数字之和
 */

public class OII0049 {
    // code beginning
    class Solution {
        public int sumNumbers(TreeNode root) {
            return dfs(root, 0);
        }

        private int dfs(TreeNode root, int pre) {
            if (root == null) return 0;
            int sum = pre * 10 + root.val;
            if (root.left == null && root.right == null) {
                return sum;
            } else {
                return dfs(root.left, sum) + dfs(root.right, sum);
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new OII0049().new Solution();
        Object ans = s.sumNumbers(new TreeNode("[4,9,0,5,1]"));
        System.out.println(ans);
    }
}