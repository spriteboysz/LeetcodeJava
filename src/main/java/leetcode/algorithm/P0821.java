package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-09-17 21:01
 * FileName: src/main/java/leetcode/algorithm
 * Description:821. 字符的最短距离
 */

public class P0821 {
    // code beginning
    class Solution {
        public int[] shortestToChar(String s, char c) {
            int n = s.length();
            int[] distance = new int[n];
            for (int i = 0, index = -n; i < n; i++) {
                if (s.charAt(i) == c) {
                    index = i;
                }
                distance[i] = i - index;
            }
            for (int i = n - 1, index = n * 2; i >= 0; i--) {
                if (s.charAt(i) == c) {
                    index = i;
                }
                distance[i] = Math.min(distance[i], index - i);
            }
            return distance;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0821().new Solution();
        var ans = s.shortestToChar("loveleetcode", 'e');
        System.out.println(Arrays.toString(ans));
    }
}
