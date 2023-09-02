package leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-14 23:09
 * LastEditTime: 2022-07-14 23:09
 * Description: 2089. 找出数组排序后的目标下标
 */

public class P2089 {
    // code beginning
    class Solution {
        public List<Integer> targetIndices(int[] nums, int target) {
            Arrays.sort(nums);
            List<Integer> indices = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) indices.add(i);
            }
            return indices;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2089().new Solution();
        Object ans = s.targetIndices(new int[]{1, 2, 5, 2, 3}, 3);
        System.out.println(ans);
        ans = s.targetIndices(new int[]{1, 2, 5, 2, 3}, 4);
        System.out.println(ans);
        ans = s.targetIndices(new int[]{1, 2, 5, 2, 3}, 2);
        System.out.println(ans);
    }
}