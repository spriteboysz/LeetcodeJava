package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-15 21:50
 * FileName: src/main/java/leetcode/algorithm
 * Description:1016. 子串能表示从 1 到 N 数字的二进制串
 */

public class P1016 {
    // code beginning
    class Solution {
        public boolean queryString(String s, int n) {
            if (n > 1000) return false;
            for (int i = 0; i < n / 2; i++) {
                if (!s.contains(Integer.toString(i, 2))) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1016().new Solution();
        var ans = s.queryString("0110", 3);
        System.out.println(ans);
    }
}
