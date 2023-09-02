package leetcode.algorithm;

import leetcode.common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-07-19 23:20
 * LastEditTime: 2022-07-19 23:20
 * Description: 538. 把二叉搜索树转换为累加树
 */

public class P0538 {
    // code beginning
    class Solution {
        int sum = 0;

        public TreeNode convertBST(TreeNode root) {
            if (root == null) return null;
            convertBST(root.right);
            sum += root.val;
            root.val = sum;
            convertBST(root.left);
            return root;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0538().new Solution();
        Object ans = s.convertBST(new TreeNode("[4,1,6,0,2,5,7,null,null,null,3,null,null,null,8]"));
        System.out.println(ans);
    }
}