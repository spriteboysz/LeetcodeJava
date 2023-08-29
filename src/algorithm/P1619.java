package algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-13 21:48
 * LastEditTime: 2022-07-13 21:48
 * Description: 1619. 删除某些元素后的数组均值
 */

public class P1619 {
    // code beginning
    class Solution {
        public double trimMean(int[] arr) {
            Arrays.sort(arr);
            int n = arr.length, sum = 0;
            for (int i = (int) (n * 0.05); i < arr.length - (int) (n * 0.05); i++) {
                sum += arr[i];
            }
            return sum / (n * 0.9d);
        }
    }

    public static void main(String[] args) {
        Solution s = new P1619().new Solution();
        Object ans = s.trimMean(new int[]{6, 0, 7, 0, 7, 5, 7, 8, 3, 4, 0, 7, 8, 1, 6, 8, 1, 1, 2, 4, 8, 1, 9, 5, 4, 3, 8, 5, 10, 8, 6, 6, 1, 0, 6, 10, 8, 2, 3, 4});
        System.out.println(ans);
        ans = s.trimMean(new int[]{9, 7, 8, 7, 7, 8, 4, 4, 6, 8, 8, 7, 6, 8, 8, 9, 2, 6, 0, 0, 1, 10, 8, 6, 3, 3, 5, 1, 10, 9, 0, 7, 10, 0, 10, 4, 1, 10, 6, 9, 3, 6, 0, 0, 2, 7, 0, 6, 7, 2, 9, 7, 7, 3, 0, 1, 6, 1, 10, 3});
        System.out.println(ans);
        ans = s.trimMean(new int[]{4, 8, 4, 10, 0, 7, 1, 3, 7, 8, 8, 3, 4, 1, 6, 2, 1, 1, 8, 0, 9, 8, 0, 3, 9, 10, 3, 10, 1, 10, 7, 3, 2, 1, 4, 9, 10, 7, 6, 4, 0, 8, 5, 1, 2, 1, 6, 2, 5, 0, 7, 10, 9, 10, 3, 7, 10, 5, 8, 5, 7, 6, 7, 6, 10, 9, 5, 10, 5, 5, 7, 2, 10, 7, 7, 8, 2, 0, 1, 1});
        System.out.println(ans);
    }
}