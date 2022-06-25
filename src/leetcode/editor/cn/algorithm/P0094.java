package leetcode.editor.cn.algorithm;

import java.util.ArrayList;
import java.util.List;


/**
 * Author: @Deean
 * Date: 2022-06-25 22:22
 * LastEditTime: 2022-06-25 22:22
 * Description: 94. 二叉树的中序遍历
 */

public class P0094 {
    // code beginning
    class Solution {
        ArrayList<Integer> values = new ArrayList<>();

        public List<Integer> inorderTraversal(TreeNode root) {
            if (root == null) return values;
            dfs(root);
            return values;
        }

        public void dfs(TreeNode node) {
            if (node == null) return;
            dfs(node.left);
            values.add(node.val);
            dfs(node.right);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0094().new Solution();
        Object ans = s.inorderTraversal(null);
        System.out.println(ans);
    }
}