package algorithm;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-23 13:45
 * LastEditTime: 2022-07-23 13:45
 * Description: 114. 二叉树展开为链表
 */

public class P0114 {
    // code beginning
    class Solution {
        List<TreeNode> nodes = new ArrayList<>();

        public void flatten(TreeNode root) {
            dfs(root);
            for (int i = 1; i < nodes.size(); i++) {
                TreeNode pre = nodes.get(i - 1);
                pre.right = nodes.get(i);
                pre.left = null;
            }
            // System.out.println(root);
        }

        private void dfs(TreeNode node) {
            if (node == null) return;
            nodes.add(node);
            dfs(node.left);
            dfs(node.right);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0114().new Solution();
        s.flatten(new TreeNode("[1,2,5,3,4,null,6]"));
        System.out.println();
    }
}