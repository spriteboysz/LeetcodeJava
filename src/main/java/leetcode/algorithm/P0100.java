package leetcode.algorithm;

import leetcode.common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-07-22 22:55
 * LastEditTime: 2022-07-22 22:55
 * Description: 100. 相同的树
 */

public class P0100 {
    // code beginning
    class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if (p == null && q == null) {
                return true;
            } else if (p == null || q == null) {
                return false;
            } else if (p.val != q.val) {
                return false;
            } else {
                return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new P0100().new Solution();
        Object ans = s.isSameTree(new TreeNode("[1,2,3]"), new TreeNode("[1,2,3]"));
        System.out.println(ans);
    }
}