package leetcode.editor.cn.algorithm;

import leetcode.editor.cn.common.TreeNode;

import java.util.TreeSet;

/**
 * Author: Deean
 * Date: 2022-07-22 23:26
 * LastEditTime: 2022-07-22 23:26
 * Description: 671. 二叉树中第二小的节点
 */

public class P0671 {
    // code beginning
    class Solution {
        TreeSet<Integer> values = new TreeSet<>();

        public int findSecondMinimumValue(TreeNode root) {
            dfs(root);
            if (values.size() < 2) return -1;
            values.pollFirst();
            return values.first();
        }

        private void dfs(TreeNode node) {
            if (node == null) return;
            dfs(node.left);
            values.add(node.val);
            dfs(node.right);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0671().new Solution();
        Object ans = s.findSecondMinimumValue(new TreeNode("[2,2,2]"));
        System.out.println(ans);
        ans = s.findSecondMinimumValue(new TreeNode("[2,2,5,null,null,5,7]"));
        System.out.println(ans);
    }
}