package sword;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-26 23:17
 * LastEditTime: 2022-07-26 23:17
 * Description: 剑指 Offer II 015. 字符串中的所有变位词
 */

public class OII0015 {
    // code beginning
    class Solution {
        public List<Integer> findAnagrams(String s, String p) {
            char[] chars1 = p.toCharArray();
            Arrays.sort(chars1);
            String pstr = String.valueOf(chars1);
            List<Integer> anagrams = new ArrayList<>();
            for (int i = 0; i <= s.length() - p.length(); i++) {
                String temp = s.substring(i, i + p.length());
                char[] chars2 = temp.toCharArray();
                Arrays.sort(chars2);
                if (String.valueOf(chars2).equals(pstr)) anagrams.add(i);
            }
            return anagrams;
        }
    }

    public static void main(String[] args) {
        Solution s = new OII0015().new Solution();
        Object ans = s.findAnagrams("abab", "ab");
        System.out.println(ans);
    }
}