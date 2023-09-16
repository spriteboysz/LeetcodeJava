package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-16 20:56
 * FileName: src/main/java/leetcode/algorithm
 * Description:2843. 统计对称整数的数目
 */

public class P2843 {
    // code beginning
    class Solution {
        public int countSymmetricIntegers(int low, int high) {
            int cnt = 0;
            for (int i = low; i <= high; i++) {
                String s = String.valueOf(i);
                if (s.length() % 2 == 1) continue;
                int sum1 = 0, sum2 = 0;
                for (int j = 0, n = s.length(); j < n / 2; j++) {
                    sum1 += s.charAt(j) - '0';
                    sum2 += s.charAt(n / 2 + j) - '0';
                }
                if (sum1 == sum2) {
                    cnt++;
                }
            }
            return cnt;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2843().new Solution();
        var ans = s.countSymmetricIntegers(1200, 1230);
        System.out.println(ans);
    }
}
