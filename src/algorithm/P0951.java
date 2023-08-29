package algorithm;

import common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-07-22 21:05
 * LastEditTime: 2022-07-22 21:05
 * Description: 951. 翻转等价二叉树
 */

public class P0951 {
    // code beginning
    class Solution {
        public boolean flipEquiv(TreeNode root1, TreeNode root2) {
            if (root1 == root2) return true;
            if (root1 == null || root2 == null || root1.val != root2.val) return false;
            return flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right) ||
                    flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0951().new Solution();
        Object ans = s.flipEquiv(new TreeNode("[1,2,3,4,5,6,null,null,null,7,8]"), new TreeNode("[1,3,2,null,6,4,5,null,null,null,null,8,7]"));
        System.out.println(ans);
    }
}