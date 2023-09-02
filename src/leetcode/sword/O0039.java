package leetcode.sword;

import java.util.HashMap;

/**
 * Author: Deean
 * Date: 2022-07-10 15:42
 * LastEditTime: 2022-07-10 15:42
 * Description: 剑指 Offer 39. 数组中出现次数超过一半的数字
 */

public class O0039 {
    // code beginning
    class Solution {
        public int majorityElement(int[] nums) {
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            for (int num : nums) {
                hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
                if (hashMap.get(num) > nums.length / 2) return num;
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new O0039().new Solution();
        Object ans = s.majorityElement(new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2});
        System.out.println(ans);
    }
}