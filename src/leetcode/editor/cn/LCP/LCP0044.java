package leetcode.editor.cn.LCP;

import leetcode.editor.cn.common.TreeNode;

import java.util.HashSet;

/**
 * Author: Deean
 * Date: 2022-07-01 23:44
 * LastEditTime: 2022-07-01 23:44
 * Description: LCP 44. 开幕式焰火
 */

public class LCP0044 {
    // code beginning
    class Solution {
        HashSet<Integer> color = new HashSet<>();

        public int numColor(TreeNode root) {
            dfs(root);
            return color.size();
        }

        private void dfs(TreeNode node) {
            if (node == null) return;
            color.add(node.val);
            dfs(node.left);
            dfs(node.right);
        }
    }

    public static void main(String[] args) {
        Solution s = new LCP0044().new Solution();
        Object ans = s.numColor(new TreeNode(""));
        System.out.println(ans);
    }
}