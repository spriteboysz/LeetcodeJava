package algorithm;

import common.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2022-08-28 17:56
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 105. 从前序与中序遍历序列构造二叉树
 */

public class P0105 {
    // code beginning
    class Solution {
        Map<Integer, Integer> map = new HashMap<>();

        public TreeNode buildTree(int[] preorder, int[] inorder) {
            for (int i = 0; i < inorder.length; i++) {
                map.put(inorder[i], i);
            }
            return dfs(preorder, 0, preorder.length - 1, 0, inorder.length - 1);
        }

        private TreeNode dfs(int[] preorder, int pl, int pr, int il, int ir) {
            if (pl > pr || il > ir) return null;
            int k = map.get(preorder[pl]) - il;
            TreeNode node = new TreeNode(preorder[pl]);
            node.left = dfs(preorder, pl + 1, pl + k, il, il + k - 1);
            node.right = dfs(preorder, pl + k + 1, pr, il + k + 1, ir);
            return node;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0105().new Solution();
        Object ans = s.buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
        System.out.println(ans);
    }
}