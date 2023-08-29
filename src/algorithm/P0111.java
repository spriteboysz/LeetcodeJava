package algorithm;

import common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-07-22 23:05
 * LastEditTime: 2022-07-22 23:05
 * Description: 111. 二叉树的最小深度
 */

public class P0111 {
    // code beginning
    class Solution {
        public int minDepth(TreeNode root) {
            if (root == null) return 0;
            if (root.left == null && root.right == null) return 1;
            int min = Integer.MAX_VALUE;
            if (root.left != null) {
                min = Math.min(min, minDepth(root.left));
            }
            if (root.right != null) {
                min = Math.min(min, minDepth(root.right));
            }
            return min + 1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0111().new Solution();
        Object ans = s.minDepth(new TreeNode("[2,null,3,null,4,null,5,null,6]"));
        System.out.println(ans);
    }
}