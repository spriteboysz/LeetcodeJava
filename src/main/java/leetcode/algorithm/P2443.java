package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-08 22:36
 * FileName: src/leetcode/algorithm
 * Description:2443. 反转之后的数字和
 */

public class P2443 {
    // code beginning
    class Solution {
        public boolean sumOfNumberAndReverse(int num) {
            for (int i = 0; i <= num; i++) {
                StringBuilder ss = new StringBuilder().append(i);
                if (i + Integer.parseInt(ss.reverse().toString()) == num) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2443().new Solution();
        var ans = s.sumOfNumberAndReverse(443);
        System.out.println(ans);
    }
}
