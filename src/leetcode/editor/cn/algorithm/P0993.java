package leetcode.editor.cn.algorithm;

import leetcode.editor.cn.common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-08-17 21:36
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 993. 二叉树的堂兄弟节点
 */

public class P0993 {
    // code beginning
    class Solution {
        public boolean isCousins(TreeNode root, int x, int y) {
            int[] xi = dfs(root, null, 0, x);
            int[] yi = dfs(root, null, 0, y);
            return xi[0] != yi[0] && xi[1] == yi[1];
        }

        private int[] dfs(TreeNode root, TreeNode father, int depth, int v) {
            if (root == null) return new int[]{-1, -1};
            if (root.val == v) {
                return new int[]{father == null ? 1 : father.val, depth};
            }
            int[] left = dfs(root.left, root, depth + 1, v);
            if (left[0] != -1) return left;
            return dfs(root.right, root, depth + 1, v);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0993().new Solution();
        Object ans = s.isCousins(new TreeNode("[1,2,3,null,4,null,5]"), 4, 5);
        System.out.println(ans);
    }
}