package leetcode.algorithm;

import java.util.HashMap;

/**
 * Author: Deean
 * Date: 2024-06-02 10:20
 * FileName: src/main/java/leetcode/algorithm
 * Description: 3158. 求出出现两次数字的 XOR 值
 */

public class P3158 {
    // code beginning
    class Solution {
        public int duplicateNumbersXOR(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            int xor = 0;
            for (int num : map.keySet()) {
                if (map.get(num) == 2) {
                    xor ^= num;
                }
            }
            return xor;
        }
    }

    public static void main(String[] args) {
        Solution s = new P3158().new Solution();
        var ans = s.duplicateNumbersXOR(new int[]{1, 2, 2, 1});
        System.out.println(ans);
    }
}
