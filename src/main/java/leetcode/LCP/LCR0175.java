package leetcode.LCP;

import leetcode.common.TreeNode;

/**
 * Author: Deean
 * Date: 2023-10-01 19:31
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 175. 计算二叉树的深度
 */

public class LCR0175 {
    // code beginning
    class Solution {
        public int calculateDepth(TreeNode root) {
            if (root == null) return 0;
            return Math.max(calculateDepth(root.left), calculateDepth(root.right)) + 1;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0175().new Solution();
        var ans = s.calculateDepth(new TreeNode("[1, 2, 2, 3, null, null, 5, 4, null, null, 4]"));
        System.out.println(ans);
    }
}
