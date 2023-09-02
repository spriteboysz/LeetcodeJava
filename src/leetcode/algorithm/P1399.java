package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-08 23:09
 * Description: 1399. 统计最大组的数目
 */

public class P1399 {
    // code beginning
    class Solution {
        public int countLargestGroup(int n) {
            int[] group = new int[37];
            int max = 0, count = 0;
            for (int i = 1; i <= n; i++) {
                max = Math.max(max, ++group[process(i)]);
            }
            for (int i = 1; i < 37; i++) {
                if (group[i] == max) count++;
            }
            return count;
        }

        private int process(int n) {
            String s = String.valueOf(n);
            int sum = 0;
            for (char c : s.toCharArray()) sum += c - '0';
            return sum;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1399().new Solution();
        Object ans = s.countLargestGroup(15);
        System.out.println(ans);
    }
}