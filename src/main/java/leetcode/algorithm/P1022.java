package leetcode.algorithm;

import leetcode.common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-08-07 17:41
 * Description: 1022. 从根到叶的二进制数之和
 */

public class P1022 {
    // code beginning
    class Solution {
        public int sumRootToLeaf(TreeNode root) {
            return dfs(root, 0);
        }

        private int dfs(TreeNode root, int pre) {
            if (root == null) return 0;
            int sum = pre * 2 + root.val;
            if (root.left == null & root.right == null) {
                return sum;
            } else {
                return dfs(root.left, sum) + dfs(root.right, sum);
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new P1022().new Solution();
        Object ans = s.sumRootToLeaf(new TreeNode("[1,0,1,0,1,0,1]"));
        System.out.println(ans);
    }
}