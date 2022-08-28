package leetcode.editor.cn.sword;

import leetcode.editor.cn.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2022-08-28 17:20
 * FileName: src/leetcode/editor/cn/sword
 * Description: 剑指 Offer 07. 重建二叉树
 */

public class O0007 {
    // code beginning
    class Solution {
        int[] preorder;
        Map<Integer, Integer> map = new HashMap<>();

        public TreeNode buildTree(int[] preorder, int[] inorder) {
            this.preorder = preorder;
            for (int i = 0; i < inorder.length; i++) {
                map.put(inorder[i], i);
            }
            return dfs(0, 0, inorder.length - 1);
        }

        private TreeNode dfs(int root, int left, int right) {
            if (left > right) return null;
            TreeNode node = new TreeNode(preorder[root]);
            int i = map.get(preorder[root]);
            node.left = dfs(root + 1, left, i - 1);
            node.right = dfs(root + i - left + 1, i + 1, right);
            return node;
        }
    }

    public static void main(String[] args) {
        Solution s = new O0007().new Solution();
        Object ans = s.buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
        System.out.println(ans);
    }
}