package leetcode.editor.cn.sword;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-29 00:22
 * LastEditTime: 2022-07-29 00:22
 * Description: 剑指 Offer 21. 调整数组顺序使奇数位于偶数前面
 */

public class O0021 {
    // code beginning
    class Solution {
        public int[] exchange(int[] nums) {
            List<Integer> odd = new ArrayList<>(), even = new ArrayList<>();
            for (int num : nums) {
                if (num % 2 == 0) {
                    even.add(num);
                } else {
                    odd.add(num);
                }
            }
            int index = 0;
            for (Integer integer : odd) nums[index++] = integer;
            for (Integer integer : even) nums[index++] = integer;
            return nums;
        }
    }

    public static void main(String[] args) {
        Solution s = new O0021().new Solution();
        int[] ans = s.exchange(new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(ans));
    }
}