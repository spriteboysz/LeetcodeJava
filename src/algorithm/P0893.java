package algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2022-08-23 23:14
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 893. 特殊等价字符串组
 */

public class P0893 {
    // code beginning
    class Solution {
        public int numSpecialEquivGroups(String[] words) {
            Set<String> set = new HashSet<>();
            for (String word : words) {
                StringBuilder odd = new StringBuilder(), even = new StringBuilder();
                for (int i = 0; i < word.length(); i++) {
                    char c = word.charAt(i);
                    if (i % 2 == 0) even.append(c);
                    if (i % 2 != 0) odd.append(c);
                }
                char[] o = odd.toString().toCharArray(), e = even.toString().toCharArray();
                Arrays.sort(o);
                Arrays.sort(e);
                set.add(new String(o) + new String(e));
            }
            return set.size();
        }
    }

    public static void main(String[] args) {
        Solution s = new P0893().new Solution();
        Object ans = s.numSpecialEquivGroups(new String[]{"abc", "acb", "bac", "bca", "cab", "cba"});
        System.out.println(ans);
    }
}