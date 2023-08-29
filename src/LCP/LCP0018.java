package LCP;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-08-18 23:11
 * FileName: src/leetcode/editor/cn/LCP
 * Description: LCP 18. 早餐组合
 */

public class LCP0018 {
    // code beginning
    class Solution {
        public int breakfastNumber(int[] staple, int[] drinks, int x) {
            int left = 0, right = drinks.length - 1, count = 0, MOD = 1000000007;
            Arrays.sort(staple);
            Arrays.sort(drinks);
            while (left < staple.length && right >= 0) {
                if (staple[left] + drinks[right] <= x) {
                    count = (count + right + 1) % MOD;
                    left++;
                } else {
                    right--;
                }
            }
            return count % MOD;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCP0018().new Solution();
        Object ans = s.breakfastNumber(new int[]{2, 1, 1}, new int[]{8, 9, 5, 1}, 9);
        System.out.println(ans);
    }
}