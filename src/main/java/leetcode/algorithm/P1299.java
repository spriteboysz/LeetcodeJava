package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-14 23:14
 * LastEditTime: 2022-07-14 23:14
 * Description: 1299. 将每个元素替换为右侧最大元素
 */

public class P1299 {
    // code beginning
    class Solution {
        public int[] replaceElements(int[] arr) {
            int n = arr.length;
            if (n == 1) return new int[]{-1};
            int[] res = new int[n];
            res[n - 1] = -1;
            int max = arr[n - 1];
            for (int i = n - 2; i >= 0; --i) {
                res[i] = max;
                max = Math.max(max, arr[i]);
            }
            return res;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1299().new Solution();
        int[] ans = s.replaceElements(new int[]{17, 18, 5, 4, 6, 1});
        System.out.println(Arrays.toString(ans));
    }
}