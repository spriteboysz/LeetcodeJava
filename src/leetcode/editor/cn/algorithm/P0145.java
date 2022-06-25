package leetcode.editor.cn.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: @Deean
 * Date: 2022-06-25 22:47
 * LastEditTime: 2022-06-25 22:47
 * Description: 145. 二叉树的后序遍历
 */

public class P0145 {
    // code beginning
    class Solution {
        ArrayList<Integer> values = new ArrayList<>();

        public List<Integer> postorderTraversal(TreeNode root) {
            if (root == null) return values;
            dfs(root);
            return values;
        }

        public void dfs(TreeNode node) {
            if (node == null) return;
            dfs(node.left);
            dfs(node.right);
            values.add(node.val);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0145().new Solution();
        Object ans = s.postorderTraversal(null);
        System.out.println(ans);
    }
}