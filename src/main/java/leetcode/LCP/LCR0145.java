package leetcode.LCP;

import leetcode.common.TreeNode;

/**
 * Author: Deean
 * Date: 2023-09-30 17:10
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 145. 判断对称二叉树
 */

public class LCR0145 {
    // code beginning
    class Solution {
        public boolean checkSymmetricTree(TreeNode root) {
            if (root == null) return true;
            return check(root.left, root.right);
        }

        private boolean check(TreeNode left, TreeNode right) {
            if (left == null && right == null) {
                return true;
            }
            if (left == null || right == null) {
                return false;
            }
            return left.val == right.val && check(left.left, right.right) && check(left.right, right.left);
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0145().new Solution();
        var ans = s.checkSymmetricTree(new TreeNode("[6,7,7,8,9,9,8]"));
        System.out.println(ans);
    }
}
