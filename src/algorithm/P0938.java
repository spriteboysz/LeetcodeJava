package algorithm;

import common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-07-09 22:12
 * LastEditTime: 2022-07-09 22:12
 * Description: 938. 二叉搜索树的范围和
 */

public class P0938 {
    // code beginning
    class Solution {
        public int rangeSumBST(TreeNode root, int low, int high) {
            if (root == null) return 0;
            if (root.val > high) {
                return rangeSumBST(root.left, low, high);
            } else if (root.val < low) {
                return rangeSumBST(root.right, low, high);
            } else {
                return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new P0938().new Solution();
        Object ans = s.rangeSumBST(new TreeNode("[10,5,15,3,7,13,18,1,null,6]"), 6, 10);
        System.out.println(ans);
    }
}