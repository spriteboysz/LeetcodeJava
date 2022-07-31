package leetcode.editor.cn.sword;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2022-07-31 23:59
 * LastEditTime: 2022-07-31 23:59
 * Description: 剑指 Offer II 065. 最短的单词编码
 */

public class OII0065 {
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
        Solution s = new OII0065().new Solution();
        Object ans = s.minimumLengthEncoding(new String[]{"time", "me", "bell"});
        System.out.println(ans);
    }
}