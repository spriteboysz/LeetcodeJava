package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-13 21:32
 * LastEditTime: 2022-07-13 21:32
 * Description: 1122. 数组的相对排序
 */

public class P1122 {
    // code beginning
    class Solution {
        public int[] relativeSortArray(int[] arr1, int[] arr2) {
            int[] count = new int[1001];
            for (int num : arr1) {
                count[num]++;
            }
            int index = 0;
            for (int num : arr2) {
                while (count[num]-- > 0) {
                    arr1[index++] = num;
                }
            }
            for (int i = 0; i < 1001; i++) {
                while (count[i]-- > 0) {
                    arr1[index++] = i;
                }
            }
            return arr1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1122().new Solution();
        int[] ans = s.relativeSortArray(new int[]{28, 6, 22, 8, 44, 17}, new int[]{22, 28, 8, 6});
        System.out.println(Arrays.toString(ans));
    }
}