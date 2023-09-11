package leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-26 23:29
 * LastEditTime: 2022-07-26 23:29
 * Description: 438. 找到字符串中所有字母异位词
 */

public class P0438 {
    // code beginning
    class Solution {
        public List<Integer> findAnagrams(String s, String p) {
            char[] chars1 = p.toCharArray();
            Arrays.sort(chars1);
            String target = String.valueOf(chars1);
            List<Integer> anagrams = new ArrayList<>();
            for (int i = 0; i <= s.length() - p.length(); i++) {
                String temp = s.substring(i, i + p.length());
                char[] chars2 = temp.toCharArray();
                Arrays.sort(chars2);
                if (String.valueOf(chars2).equals(target)) {
                    anagrams.add(i);
                }
            }
            return anagrams;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0438().new Solution();
        Object ans = s.findAnagrams("abab", "ab");
        System.out.println(ans);
    }
}