package leetcode.algorithm;

import leetcode.common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-07-19 23:23
 * LastEditTime: 2022-07-19 23:23
 * Description: 1038. 从二叉搜索树到更大和树
 */

public class P1038 {
    // code beginning
    class Solution {
        int sum = 0;

        public TreeNode bstToGst(TreeNode root) {
            if (root == null) return null;
            bstToGst(root.right);
            sum += root.val;
            root.val = sum;
            bstToGst(root.left);
            return root;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1038().new Solution();
        Object ans = s.bstToGst(new TreeNode("[4,1,6,0,2,5,7,null,null,null,3,null,null,null,8]"));
        System.out.println(ans);
    }
}