package leetcode.LCP;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2023-09-27 22:28
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 004. 只出现一次的数字 II
 */

public class LCR0004 {
    // code beginning
    class Solution {
        public int singleNumber(int[] nums) {
            Map<Integer, Integer> hash = new HashMap<>();
            for (int num : nums) {
                hash.put(num, hash.getOrDefault(num, 0) + 1);
            }
            for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
                if (entry.getValue() == 1) {
                    return entry.getKey();
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0004().new Solution();
        var ans = s.singleNumber(new int[]{0, 1, 0, 1, 0, 1, 100});
        System.out.println(ans);
    }
}
