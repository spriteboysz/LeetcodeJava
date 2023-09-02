package leetcode.interview;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2022-07-29 21:52
 * LastEditTime: 2022-07-29 21:52
 * Description: 面试题 01.04. 回文排列
 */

public class M00010004 {
    // code beginning
    class Solution {
        public boolean canPermutePalindrome(String s) {
            Map<Character, Integer> map = new HashMap<>();
            for (char c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            int count = 0;
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                count += entry.getValue() % 2;
            }
            return count <= 1;
        }
    }

    public static void main(String[] args) {
        Solution s = new M00010004().new Solution();
        Object ans = s.canPermutePalindrome("tactcoa");
        System.out.println(ans);
        ans = s.canPermutePalindrome("AaBb//a");
        System.out.println(ans);
    }
}