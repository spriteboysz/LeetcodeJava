package interview;

import common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-07-27 21:34
 * LastEditTime: 2022-07-27 21:34
 * Description: 面试题 04.10. 检查子树
 */

public class M00040010 {
    // code beginning
    class Solution {
        public boolean checkSubTree(TreeNode t1, TreeNode t2) {
            StringBuilder s1 = new StringBuilder(), s2 = new StringBuilder();
            dfs(t1, s1);
            dfs(t2, s2);
            return s1.toString().contains(s2.toString());
        }

        void dfs(TreeNode node, StringBuilder s) {
            if (node == null) return;
            dfs(node.left, s);
            s.append(node.val);
            dfs(node.right, s);
        }
    }

    public static void main(String[] args) {
        Solution s = new M00040010().new Solution();
        Object ans = s.checkSubTree(new TreeNode("[1,2,3]"), new TreeNode("[2]"));
        System.out.println(ans);
        s.checkSubTree(new TreeNode("[4,2,3,4,5,6,7,8,9]"), new TreeNode("[4,8,9]"));
        System.out.println(ans);
    }
}