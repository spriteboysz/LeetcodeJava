package leetcode.sword;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-06 23:03
 * LastEditTime: 2022-07-06 23:03
 * Description: 剑指 Offer 54. 二叉搜索树的第k大节点
 */

public class O0054 {
    // code beginning
    class Solution {
        List<Integer> values = new ArrayList<>();

        public int kthLargest(TreeNode root, int k) {
            dfs(root);
            return values.get(k - 1);
        }

        private void dfs(TreeNode node) {
            if (node == null) return;
            dfs(node.right);
            values.add(node.val);
            dfs(node.left);
        }
    }

    public static void main(String[] args) {
        Solution s = new O0054().new Solution();
        Object ans = s.kthLargest(new TreeNode("[5,3,6,2,4,null,null,1]"), 3);
        System.out.println(ans);
    }
}