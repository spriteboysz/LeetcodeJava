package algorithm;

import common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-07-20 00:09
 * LastEditTime: 2022-07-20 00:09
 * Description: 404. 左叶子之和
 */

public class P0404 {
    // code beginning
    class Solution {
        public int sumOfLeftLeaves(TreeNode root) {
            if (root == null) return 0;
            int sum = 0;
            if (root.left != null && root.left.left == null & root.left.right == null) {
                sum = root.left.val;
            }
            return sum + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0404().new Solution();
        Object ans = s.sumOfLeftLeaves(new TreeNode("[3,9,20,null,null,15,7]"));
        System.out.println(ans);
    }
}