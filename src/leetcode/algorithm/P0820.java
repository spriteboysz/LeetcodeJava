package leetcode.algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2022-08-01 00:05
 * LastEditTime: 2022-08-01 00:05
 * Description: 820. 单词的压缩编码
 */

public class P0820 {
    // code beginning
    class Solution {
        public int minimumLengthEncoding(String[] words) {
            Set<String> set = new HashSet<>(Arrays.asList(words));
            for (String word : words) {
                for (int i = 1; i < word.length(); i++) {
                    set.remove(word.substring(i));
                }
            }

            int count = 0;
            for (String word : set) {
                count += word.length() + 1;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0820().new Solution();
        Object ans = s.minimumLengthEncoding(new String[]{"time", "me", "bell"});
        System.out.println(ans);
    }
}