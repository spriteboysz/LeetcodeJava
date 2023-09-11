package leetcode.algorithm;

import leetcode.common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-07-06 22:07
 * LastEditTime: 2022-07-06 22:07
 * Description: 700. 二叉搜索树中的搜索
 */

public class P0700 {
    // code beginning
    class Solution {
        public TreeNode searchBST(TreeNode root, int val) {
            if (root == null) return null;
            if (root.val > val) {
                return searchBST(root.left, val);
            } else if (root.val < val) {
                return searchBST(root.right, val);
            } else {
                return root;
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new P0700().new Solution();
        Object ans = s.searchBST(new TreeNode("[4,2,7,1,3]"), 2);
        System.out.println(ans);
    }
}