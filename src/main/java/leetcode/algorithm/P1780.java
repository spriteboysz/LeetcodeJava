package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-17 20:54
 * FileName: src/main/java/leetcode/algorithm
 * Description:1780. 判断一个数字是否可以表示成三的幂的和
 */

public class P1780 {
    // code beginning
    class Solution {
        public boolean checkPowersOfThree(int n) {
            StringBuilder ss = new StringBuilder();
            while (n > 0) {
                ss.append(n % 3);
                n /= 3;
            }
            return !ss.toString().contains("2");
        }
    }

    public static void main(String[] args) {
        Solution s = new P1780().new Solution();
        var ans = s.checkPowersOfThree(91);
        System.out.println(ans);
        System.out.println(s.checkPowersOfThree(21));
    }
}
