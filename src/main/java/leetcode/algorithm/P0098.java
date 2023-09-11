package leetcode.algorithm;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-22 22:41
 * LastEditTime: 2022-07-22 22:41
 * Description: 98. 验证二叉搜索树
 */

public class P0098 {
    // code beginning
    class Solution {
        List<Integer> values = new ArrayList<>();

        public boolean isValidBST(TreeNode root) {
            dfs(root);
            for (int i = 1; i < values.size(); i++) {
                if (values.get(i) <= values.get(i - 1)) return false;
            }
            return true;
        }

        private void dfs(TreeNode node) {
            if (node == null) return;
            dfs(node.left);
            values.add(node.val);
            dfs(node.right);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0098().new Solution();
        Object ans = s.isValidBST(new TreeNode("[5,1,4,null,null,3,6]"));
        System.out.println(ans);
    }
}