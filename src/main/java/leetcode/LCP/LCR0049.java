package leetcode.LCP;

import leetcode.common.TreeNode;

/**
 * Author: Deean
 * Date: 2023-09-29 22:33
 * FileName: src/main/java/leetcode/algorithm
 * Description:LCR 049. 求根节点到叶节点数字之和
 */

public class LCR0049 {
    // code beginning
    class Solution {
        public int dfs(TreeNode root, int acc) {
            if (root == null) return 0;
            int sum = acc * 10 + root.val;
            if (root.left == null && root.right == null) {
                return sum;
            } else {
                return dfs(root.left, sum) + dfs(root.right, sum);
            }
        }

        public int sumNumbers(TreeNode root) {
            return dfs(root, 0);
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0049().new Solution();
        var ans = s.sumNumbers(new TreeNode("[1,2,3]"));
        System.out.println(ans);
    }
}
