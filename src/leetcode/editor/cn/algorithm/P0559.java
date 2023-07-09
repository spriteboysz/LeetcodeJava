package leetcode.editor.cn.algorithm;


import leetcode.editor.cn.common.TreeNode;

import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-06 23:30
 * LastEditTime: 2022-07-06 23:30
 * Description: 559. N 叉树的最大深度
 */

public class P0559 {
    // code beginning
    class Solution {
        public int maxDepth(TreeNode root) {
            if (root == null) return 0;
            int maxChildDepth = 0;
            List<TreeNode> children = root.children;
            for (TreeNode child : children) {
                int childDepth = maxDepth(child);
                maxChildDepth = Math.max(maxChildDepth, childDepth);
            }
            return maxChildDepth + 1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0559().new Solution();
        System.out.println(s.maxDepth(new TreeNode("[1,2,3]")));
    }
}