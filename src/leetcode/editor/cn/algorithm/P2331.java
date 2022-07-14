package leetcode.editor.cn.algorithm;

import leetcode.editor.cn.common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-07-14 22:46
 * LastEditTime: 2022-07-14 22:46
 * Description: 2331. 计算布尔二叉树的值
 */

public class P2331 {
    // code beginning
    class Solution {
        public boolean evaluateTree(TreeNode root) {
            return switch (root.val) {
                case 0 -> false;
                case 1 -> true;
                case 2 -> evaluateTree(root.left) || evaluateTree(root.right);
                default -> evaluateTree(root.left) && evaluateTree(root.right);
            };
        }
    }

    public static void main(String[] args) {
        Solution s = new P2331().new Solution();
        Object ans = s.evaluateTree(new TreeNode("[2,1,3,null,null,0,1]"));
        System.out.println(ans);
    }
}