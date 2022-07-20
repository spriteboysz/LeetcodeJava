package leetcode.editor.cn.algorithm;

import leetcode.editor.cn.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-20 21:57
 * LastEditTime: 2022-07-20 21:57
 * Description: 230. 二叉搜索树中第K小的元素
 */

public class P0230 {
    // code beginning
    class Solution {
        List<Integer> list = new ArrayList<>();

        public int kthSmallest(TreeNode root, int k) {
            dfs(root);
            return list.get(k - 1);
        }

        private void dfs(TreeNode node) {
            if (node == null) return;
            dfs(node.left);
            list.add(node.val);
            dfs(node.right);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0230().new Solution();
        Object ans = s.kthSmallest(new TreeNode("[5,3,6,2,4,null,null,1]"), 3);
        System.out.println(ans);
    }
}