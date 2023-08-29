package algorithm;

import common.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-22 22:04
 * LastEditTime: 2022-07-22 22:04
 * Description: 501. 二叉搜索树中的众数
 */

public class P0501 {
    // code beginning
    class Solution {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        public int[] findMode(TreeNode root) {
            dfs(root);
            int maxCount = 0;
            for (int count : hashMap.values()) {
                maxCount = Math.max(count, maxCount);
            }
            List<Integer> values = new ArrayList<>();
            for (int key : hashMap.keySet()) {
                if (hashMap.get(key) == maxCount) values.add(key);
            }
            int[] nums = new int[values.size()];
            for (int i = 0; i < values.size(); i++) {
                nums[i] = values.get(i);
            }
            return nums;
        }

        private void dfs(TreeNode node) {
            if (node == null) return;
            dfs(node.left);
            hashMap.put(node.val, hashMap.getOrDefault(node.val, 0) + 1);
            dfs(node.right);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0501().new Solution();
        int[] ans = s.findMode(new TreeNode("[1,null,2,2]"));
        System.out.println(Arrays.toString(ans));
    }
}