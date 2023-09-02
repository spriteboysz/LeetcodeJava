package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-02 10:09
 * FileName: src/leetcode/algorithm
 * Description:2729. 判断一个数是否迷人
 */

public class P2729 {
    // code beginning
    class Solution {
        public boolean isFascinating(int n) {
            StringBuilder ss = new StringBuilder();
            for (int i = 1; i <= 3; i++) {
                ss.append(n * i);
            }
            if (ss.length() != 9) {
                return false;
            }
            int[] digits = new int[10];
            for (char c : ss.toString().toCharArray()) {
                digits[c - '0']++;
            }
            for (int i = 1; i < 10; i++) {
                if (digits[i] != 1) {
                    return false;
                }
            }
            return digits[0] == 0;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2729().new Solution();
        Object ans = s.isFascinating(192);
        System.out.println(ans);
    }
}
