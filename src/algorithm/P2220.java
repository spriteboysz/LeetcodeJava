package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-01 22:35
 * LastEditTime: 2022-07-01 22:35
 * Description: 2220. 转换数字的最少位翻转次数
 */

public class P2220 {
    // code beginning
    class Solution {
        public int minBitFlips(int start, int goal) {
            int count = 0;
            String s = Integer.toBinaryString(start ^ goal);
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') count++;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2220().new Solution();
        Object ans = s.minBitFlips(3, 4);
        System.out.println(ans);
    }
}