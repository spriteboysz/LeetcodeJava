package sword;

import common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-07-29 23:44
 * LastEditTime: 2022-07-29 23:44
 * Description: 剑指 Offer 28. 对称的二叉树
 */

public class O0028 {
    // code beginning
    class Solution {
        public boolean isSymmetric(TreeNode root) {
            return dfs(root, root);
        }

        private boolean dfs(TreeNode root1, TreeNode root2) {
            if (root1 == null && root2 == null) return true;
            if (root1 == null || root2 == null) return false;
            return root1.val == root2.val && dfs(root1.left, root2.right) && dfs(root1.right, root2.left);
        }
    }

    public static void main(String[] args) {
        Solution s = new O0028().new Solution();
        Object ans = s.isSymmetric(new TreeNode("[1,2,2,3,4,4,3]"));
        System.out.println(ans);
    }
}