package leetcode.editor.cn.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-08-07 15:34
 * Description: 953. 验证外星语词典
 */

public class P0953 {
    // code beginning
    class Solution {
        public boolean isAlienSorted(String[] words, String order) {
            int[] ord = new int[26];
            for (int i = 0; i < 26; i++) ord[order.charAt(i) - 'a'] = i;
            String[] clone = words.clone();
            Arrays.sort(clone, (a, b) -> {
                int n = a.length(), m = b.length();
                int i = 0, j = 0;
                while (i < n && j < m) {
                    int c1 = a.charAt(i) - 'a', c2 = b.charAt(j) - 'a';
                    if (c1 != c2) return ord[c1] - ord[c2];
                    i++;
                    j++;
                }
                if (i < n) return 1;
                if (j < m) return -1;
                return 0;
            });
            for (int i = 0; i < words.length; i++) {
                if (!clone[i].equals(words[i])) return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0953().new Solution();
        Object ans = s.isAlienSorted(new String[]{"word", "world", "row"}, "worldabcefghijkmnpqstuvxyz");
        System.out.println(ans);
    }
}