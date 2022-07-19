package leetcode.editor.cn.sword;

import leetcode.editor.cn.common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-07-19 23:14
 * LastEditTime: 2022-07-19 23:14
 * Description: 剑指 Offer II 054. 所有大于等于节点的值之和
 */

public class OII0054 {
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
        Solution s = new OII0054().new Solution();
        Object ans = s.convertBST(new TreeNode("[4,1,6,0,2,5,7,null,null,null,3,null,null,null,8]"));
        System.out.println(ans);
    }
}