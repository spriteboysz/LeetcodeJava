package leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-08-29 13:55
 * FileName: src/leetcode.algorithm
 * Description:2828. 判别首字母缩略词
 */

public class P2828 {
    // code beginning
    class Solution {
        public boolean isAcronym(List<String> words, String s) {
            if (words.size() != s.length()) {
                return false;
            }
            StringBuilder ss = new StringBuilder();
            for (String word : words) {
                ss.append(word.charAt(0));
            }
            return ss.toString().equals(s);
        }
    }

    public static void main(String[] args) {
        Solution s = new P2828().new Solution();
        Object ans = s.isAcronym(new ArrayList<>(List.of(new String[]{"never", "gonna", "give", "up", "on", "you"})), "ngguoy");
        System.out.println(ans);
    }
}
