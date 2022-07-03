package leetcode.editor.cn.algorithm;

import leetcode.editor.cn.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: @Deean
 * Date: 2022-06-25 22:43
 * LastEditTime: 2022-06-25 22:43
 * Description: 144. 二叉树的前序遍历
 */

public class P0144 {
    // code beginning
    class Solution {
        ArrayList<Integer> list = new ArrayList<>();

        public List<Integer> preorderTraversal(TreeNode root) {
            if (root == null) return list;
            dfs(root);
            return list;
        }

        public void dfs(TreeNode node) {
            if (node == null) return;
            list.add(node.val);
            dfs(node.left);
            dfs(node.right);
        }

    }

    public static void main(String[] args) {
        Solution s = new P0144().new Solution();
        Object ans = s.preorderTraversal(null);
        System.out.println(ans);
    }
}