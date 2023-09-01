package LCP;

/**
 * Author: Deean
 * Date: 2023-08-29 16:41
 * FileName: src/LCP
 * Description:LCP 66. 最小展台数量
 */

public class LCP0066 {
    // code beginning
    class Solution {
        public int minNumBooths(String[] demand) {
            int[] alphabet = new int[26];
            for (String day : demand) {
                int[] cur = new int[26];
                for (Character c : day.toCharArray()) {
                    cur[c - 'a']++;
                }
                for (int i = 0; i < 26; i++) {
                    alphabet[i] = Math.max(alphabet[i], cur[i]);
                }
            }
            int cnt = 0;
            for (int i = 0; i < 26; i++) {
                cnt += alphabet[i];
            }
            return cnt;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCP0066().new Solution();
        Object ans = s.minNumBooths(new String[]{"acd", "bed", "accd"});
        System.out.println(ans);
    }
}
