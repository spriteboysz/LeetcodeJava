package algorithm;

import common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-07-09 22:32
 * LastEditTime: 2022-07-09 22:32
 * Description: 108. 将有序数组转换为二叉搜索树
 */

public class P0108 {
    // code beginning
    class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            return dfs(nums, 0, nums.length - 1);
        }

        private TreeNode dfs(int[] nums, int left, int right) {
            if (left > right) return null;
            int mid = (left + right) / 2;
            TreeNode node = new TreeNode(nums[mid]);
            node.left = dfs(nums, left, mid - 1);
            node.right = dfs(nums, mid + 1, right);
            return node;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0108().new Solution();
        TreeNode root = s.sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});
        System.out.println(root);
    }
}