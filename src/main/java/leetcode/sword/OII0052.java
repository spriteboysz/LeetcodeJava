package leetcode.sword;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-09 23:29
 * LastEditTime: 2022-07-09 23:29
 * Description: 剑指 Offer II 052. 展平二叉搜索树
 */

public class OII0052 {
    // code beginning
    class Solution {
        List<Integer> values = new ArrayList<>();

        public TreeNode increasingBST(TreeNode root) {
            dfs(root);
            TreeNode dummy = new TreeNode(-1);
            TreeNode cur = dummy;
            for (int v : values) {
                cur.right = new TreeNode(v);
                cur = cur.right;
            }
            return dummy.right;
        }

        private void dfs(TreeNode node) {
            if (node == null) return;
            dfs(node.left);
            values.add(node.val);
            dfs(node.right);
        }
    }

    public static void main(String[] args) {
        Solution s = new OII0052().new Solution();
        Object ans = s.increasingBST(new TreeNode("[5,3,6,2,4,null,8,1,null,null,null,7,9]"));
        System.out.println(ans);
    }
}