package leetcode.editor.cn.algorithm;

import leetcode.editor.cn.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-06 23:14
 * LastEditTime: 2022-07-06 23:14
 * Description: 589. N 叉树的前序遍历
 */

public class P0589 {
    // code beginning
    class Solution {
        List<Integer> values = new ArrayList<>();

        public List<Integer> preorder(TreeNode root) {
            if (root == null) return values;
            dfs(root);
            return values;
        }

        private void dfs(TreeNode node) {
            values.add(node.val);
            for (TreeNode n : node.children) {
                dfs(n);
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new P0589().new Solution();
        System.out.println(s.preorder(new TreeNode("[1,2,3]")));
    }
}