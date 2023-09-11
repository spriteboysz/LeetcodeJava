package leetcode.algorithm;

import java.util.HashSet;

/**
 * Author: Deean
 * Date: 2022-06-26 17:35
 * LastEditTime: 2022-06-26 17:35
 * Description: 1805. 字符串中不同整数的数目
 */

public class P1805 {
    // code beginning
    class Solution {
        public int numDifferentIntegers(String word) {
            String[] words = word.split("[a-z]+");
            HashSet<String> nums = new HashSet<>();
            for (String s : words) {
                if (s.length() == 0) {
                    continue;
                }
                int j = 0;
                while (s.charAt(j) == '0' && j < s.length() - 1) {
                    j++;
                }
                nums.add(s.substring(j));
            }
            return nums.size();
        }
    }

    public static void main(String[] args) {
        Solution s = new P1805().new Solution();
        Object ans = s.numDifferentIntegers("a123bc34d8ef34");
        System.out.println(ans);
        ans = s.numDifferentIntegers("a1b01c001");
        System.out.println(ans);
    }
}