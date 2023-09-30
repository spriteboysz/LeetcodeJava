package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-29 15:40
 * FileName: src/main/java/leetcode/algorithm
 * Description:LCR 034. 验证外星语词典
 */

public class LCR0034 {
    // code beginning
    class Solution {
        public boolean isAlienSorted(String[] words, String order) {
            int[] index = new int[26];
            for (int i = 0; i < 26; i++) {
                index[order.charAt(i) - 'a'] = i;
            }
            for (int i = 0, n = words.length; i < n - 1; i++) {
                String w1 = words[i], w2 = words[i + 1];
                for (int j = 0, m1 = w1.length(), m2 = w2.length(); j < Math.max(m1, m2); j++) {
                    int i1 = j >= m1 ? -1 : index[w1.charAt(j) - 'a'];
                    int i2 = j >= m2 ? -1 : index[w2.charAt(j) - 'a'];
                    if (i1 > i2) {
                        return false;
                    } else if (i1 < i2) {
                        break;
                    }
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0034().new Solution();
        var ans = s.isAlienSorted(new String[]{"hello", "leetcode"}, "hlabcdefgijkmnopqrstuvwxyz");
        System.out.println(ans);
    }
}
