package leetcode.algorithm;

import java.util.HashMap;

/**
 * Author: Deean
 * Date: 2022-07-09 23:21
 * LastEditTime: 2022-07-09 23:21
 * Description: 2206. 将数组划分成相等数对
 */

public class P2206 {
    // code beginning
    class Solution {
        public boolean divideArray(int[] nums) {
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            for (int num : nums) {
                hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
            }
            for (Integer v : hashMap.values()) {
                if (v % 2 != 0) return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2206().new Solution();
        Object ans = s.divideArray(new int[]{3, 2, 3, 2, 2, 2});
        System.out.println(ans);
    }
}