package algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-14 23:55
 * LastEditTime: 2022-07-14 23:55
 * Description: 1304. 和为零的 N 个不同整数
 */

public class P1304 {
    // code beginning
    class Solution {
        public int[] sumZero(int n) {
            int[] lst = new int[n];
            for (int i = 1, index = 0; i <= n / 2; i++) {
                lst[index++] = i;
                lst[index++] = -i;
            }
            return lst;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1304().new Solution();
        int[] ans = s.sumZero(5);
        System.out.println(Arrays.toString(ans));
        ans = s.sumZero(6);
        System.out.println(Arrays.toString(ans));
    }
}