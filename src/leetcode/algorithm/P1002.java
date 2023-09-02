package leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-08 22:51
 * LastEditTime: 2022-07-08 22:51
 * Description: 1002. 查找共用字符
 */

public class P1002 {
    // code beginning
    class Solution {
        public List<String> commonChars(String[] words) {
            int[] common = new int[26];
            Arrays.fill(common, Integer.MAX_VALUE);
            for (String word : words) {
                int[] cur = new int[26];
                for (char c : word.toCharArray()) {
                    cur[c - 'a']++;
                }

                for (int i = 0; i < 26; i++) {
                    common[i] = Math.min(common[i], cur[i]);
                }
            }
            List<String> commonChar = new ArrayList<>();
            for (int i = 0; i < 26; i++) {
                while (common[i] > 0) {
                    commonChar.add(String.valueOf((char) (i + 'a')));
                    common[i]--;
                }
            }
            return commonChar;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1002().new Solution();
        Object ans = s.commonChars(new String[]{"cool", "lock", "cook"});
        System.out.println(ans);
    }
}