package leetcode.algorithm;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-22 23:46
 * LastEditTime: 2022-07-22 23:46
 * Description: 872. 叶子相似的树
 */

public class P0872 {
    // code beginning
    class Solution {
        public boolean leafSimilar(TreeNode root1, TreeNode root2) {
            List<Integer> leaf1 = new ArrayList<>(), leaf2 = new ArrayList<>();
            if (root1 != null) dfs(root1, leaf1);
            if (root2 != null) dfs(root2, leaf2);
            return leaf1.equals(leaf2);
        }

        private void dfs(TreeNode node, List<Integer> leaf) {
            if (node.left == null && node.right == null) {
                leaf.add(node.val);
            } else {
                if (node.left != null) dfs(node.left, leaf);
                if (node.right != null) dfs(node.right, leaf);
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new P0872().new Solution();
        Object ans = s.leafSimilar(new TreeNode("[3,5,1,6,2,9,8,null,null,7,4]"), new TreeNode("[3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]"));
        System.out.println(ans);
    }
}