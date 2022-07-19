package leetcode.editor.cn.algorithm;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Author: Deean
 * Date: 2022-07-19 23:56
 * LastEditTime: 2022-07-19 23:56
 * Description: 2341. 数组能形成多少数对
 */

public class P2341 {
    // code beginning
    class Solution {
        public int[] numberOfPairs(int[] nums) {
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            for (int num : nums) {
                hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
            }
            int count = 0;
            for (int key : hashMap.keySet()) {
                count += hashMap.get(key) / 2;
            }
            return new int[]{count, nums.length - count * 2};
        }
    }

    public static void main(String[] args) {
        Solution s = new P2341().new Solution();
        int[] ans = s.numberOfPairs(new int[]{1, 3, 2, 1, 3, 2, 2});
        System.out.println(Arrays.toString(ans));
    }
}