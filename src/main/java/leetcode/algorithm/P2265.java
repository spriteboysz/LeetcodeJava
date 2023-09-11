package leetcode.algorithm;

import leetcode.common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-08-21 23:05
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 2265. 统计值等于子树平均值的节点数
 */

public class P2265 {
    // code beginning
    class Solution {
        int count;

        public int averageOfSubtree(TreeNode root) {
            dfs(root);
            return count;
        }

        private int[] dfs(TreeNode root) {
            if (root == null) return new int[]{0, 0};
            int[] left = dfs(root.left);
            int[] right = dfs(root.right);
            int sum = left[0] + right[0] + root.val, num = left[1] + right[1] + 1;
            if (sum / num == root.val) count++;
            return new int[]{sum, num};
        }
    }

    public static void main(String[] args) {
        Solution s = new P2265().new Solution();
        Object ans = s.averageOfSubtree(new TreeNode("[4,8,5,0,1,null,6]"));
        System.out.println(ans);
    }
}