package leetcode.interview;

import leetcode.common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-07-09 22:41
 * LastEditTime: 2022-07-09 22:41
 * Description: 面试题 04.02. 最小高度树
 */

public class M00040002 {
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
        Solution s = new M00040002().new Solution();
        TreeNode ans = s.sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});
        System.out.println(ans);
    }
}