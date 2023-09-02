package leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-13 23:55
 * LastEditTime: 2022-07-13 23:55
 * Description: 1408. 数组中的字符串匹配
 */

public class P1408 {
    // code beginning
    class Solution {
        public List<String> stringMatching(String[] words) {
            List<String> match = new ArrayList<>();
            Arrays.sort(words, Comparator.comparingInt(String::length));
            for (int i = 0; i < words.length; i++) {
                for (int j = i + 1; j < words.length; j++) {
                    if (words[j].contains(words[i])) {
                        match.add(words[i]);
                        break;
                    }
                }
            }
            return match;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1408().new Solution();
        Object ans = s.stringMatching(new String[]{"leetcode", "et", "code"});
        System.out.println(ans);
        ans = s.stringMatching(new String[]{"blue", "green", "bu"});
        System.out.println(ans);
    }
}