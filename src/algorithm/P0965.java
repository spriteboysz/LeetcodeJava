package algorithm;

import common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-07-07 22:53
 * LastEditTime: 2022-07-07 22:53
 * Description: 965. 单值二叉树
 */

public class P0965 {
    // code beginning
    class Solution {
        int val = -1;

        public boolean isUnivalTree(TreeNode root) {
            if (val == -1) val = root.val;
            if (root == null) return true;
            if (root.val != val) return false;
            return isUnivalTree(root.left) && isUnivalTree(root.right);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0965().new Solution();
        Object ans = s.isUnivalTree(new TreeNode("[2,2,2,2,5]"));
        System.out.println(ans);
    }
}