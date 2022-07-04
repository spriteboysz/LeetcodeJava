package leetcode.editor.cn.algorithm;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Author: Deean
 * Date: 2022-07-05 00:02
 * LastEditTime: 2022-07-05 00:02
 * Description: 1941. 检查是否所有字符出现次数相同
 */

public class P1941 {
    // code beginning
    class Solution {
        public boolean areOccurrencesEqual(String s) {
            HashMap<Character, Integer> count = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                count.put(c, count.getOrDefault(c, 0) + 1);
            }

            return new HashSet<>(count.values()).size() == 1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1941().new Solution();
        Object ans = s.areOccurrencesEqual("aaabbb");
        System.out.println(ans);
    }
}