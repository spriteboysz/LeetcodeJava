package algorithm;

import common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-08-06 08:42
 * Description: 606. 根据二叉树创建字符串
 */

public class P0606 {
    // code beginning
    class Solution {
        StringBuilder builder = new StringBuilder();

        public String tree2str(TreeNode root) {
            dfs(root);
            return builder.substring(1, builder.length() - 1);
        }

        void dfs(TreeNode root) {
            builder.append("(").append(root.val);
            if (root.left != null) {
                dfs(root.left);
            } else if (root.right != null) {
                builder.append("()");
            }
            if (root.right != null) dfs(root.right);
            builder.append(")");
        }
    }

    public static void main(String[] args) {
        Solution s = new P0606().new Solution();
        Object ans = s.tree2str(new TreeNode("[1,2,3,null,4]"));
        System.out.println(ans);
    }
}