package leetcode.editor.cn.algorithm;

import leetcode.editor.cn.common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-07-06 22:34
 * LastEditTime: 2022-07-06 22:34
 * Description: 104. 二叉树的最大深度
 */

public class P0104 {
    // code beginning
    class Solution {
        public int maxDepth(TreeNode root) {
            if (root == null) return 0;
            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0104().new Solution();
        Object ans = s.maxDepth(new TreeNode("[3,9,20,null,null,15,7]"));
        System.out.println(ans);
    }
}