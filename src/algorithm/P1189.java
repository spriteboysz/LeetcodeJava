package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-10 17:53
 * LastEditTime: 2022-07-10 17:53
 * Description: 1189. “气球” 的最大数量
 */

public class P1189 {
    // code beginning
    class Solution {
        public int maxNumberOfBalloons(String text) {
            int[] count = new int[26];
            for (char c : text.toCharArray()) {
                count[c - 'a']++;
            }
            int countb = count['b' - 'a'];
            int counta = count[0];
            int countl = count['l' - 'a'] / 2;
            int counto = count['o' - 'a'] / 2;
            int countn = count['n' - 'a'];
            int min = Integer.MAX_VALUE;
            for (int c : new int[]{countb, counta, countl, counto, countn}) {
                min = Math.min(min, c);
            }
            return min;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1189().new Solution();
        Object ans = s.maxNumberOfBalloons("loonbalxballpoon");
        System.out.println(ans);
    }
}