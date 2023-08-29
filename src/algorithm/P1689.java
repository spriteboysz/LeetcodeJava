package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-17 11:18
 * LastEditTime: 2022-07-17 11:18
 * Description: 1689. 十-二进制数的最少数目
 */

public class P1689 {
    // code beginning
    class Solution {
        public int minPartitions(String n) {
            int max = 0;
            for (char c : n.toCharArray()) {
                max = Math.max(max, c - '0');
                if (max == 9) return 9;
            }
            return max;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1689().new Solution();
        Object ans = s.minPartitions("27346209830709182346");
        System.out.println(ans);
    }
}