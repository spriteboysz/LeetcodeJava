package algorithm;

import common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-07-22 22:48
 * LastEditTime: 2022-07-22 22:48
 * Description: 101. 对称二叉树
 */

public class P0101 {
    // code beginning
    class Solution {
        public boolean isSymmetric(TreeNode root) {
            return check(root, root);
        }

        private boolean check(TreeNode p, TreeNode q) {
            if (p == null && q == null) return true;
            if (p == null || q == null) return false;
            return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0101().new Solution();
        Object ans = s.isSymmetric(new TreeNode("[1,2,2,null,3,null,3]"));
        System.out.println(ans);
    }
}