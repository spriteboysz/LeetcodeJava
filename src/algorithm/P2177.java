package algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-08-21 23:57
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 2177. 找到和为给定整数的三个连续整数
 */

public class P2177 {
    // code beginning
    class Solution {
        public long[] sumOfThree(long num) {
            if (num % 3 != 0) return new long[]{};
            long mid = num / 3;
            return new long[]{mid - 1, mid, mid + 1};
        }
    }

    public static void main(String[] args) {
        Solution s = new P2177().new Solution();
        long[] ans = s.sumOfThree(33);
        System.out.println(Arrays.toString(ans));
        ans = s.sumOfThree(4);
        System.out.println(Arrays.toString(ans));
    }
}