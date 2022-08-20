package leetcode.editor.cn.algorithm;

import leetcode.editor.cn.common.TreeNode;

/**
 * Author: Deean
 * Date: 2022-08-20 22:01
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 654. 最大二叉树
 */

public class P0654 {
    // code beginning
    class Solution {
        int[] nums;

        public TreeNode constructMaximumBinaryTree(int[] nums) {
            this.nums = nums;
            return construct(0, nums.length - 1);
        }

        private TreeNode construct(int left, int right) {
            if (left > right) return null;
            int best = left;
            for (int i = left + 1; i <= right; i++) {
                if (nums[i] > nums[best]) best = i;
            }
            TreeNode node = new TreeNode(nums[best]);
            node.left = construct(left, best - 1);
            node.right = construct(best + 1, right);
            return node;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0654().new Solution();
        Object ans = s.constructMaximumBinaryTree(new int[]{3, 2, 1});
        System.out.println(ans);
    }
}