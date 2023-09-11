package leetcode.sword;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-13 21:15
 * LastEditTime: 2022-07-13 21:15
 * Description: 剑指 Offer II 075. 数组相对排序
 */

public class OII0075 {
    // code beginning
    class Solution {
        public int[] relativeSortArray(int[] arr1, int[] arr2) {
            int[] count = new int[1001];
            for (int num : arr1) {
                count[num]++;
            }
            int i = 0;
            for (int num : arr2) {
                while (count[num]-- > 0) {
                    arr1[i++] = num;
                }
            }
            // 在按照升序排序其他元素
            for (int j = 0; j < 1001; j++) {
                while (count[j]-- > 0) {
                    arr1[i++] = j;
                }
            }
            return arr1;
        }
    }

    public static void main(String[] args) {
        Solution s = new OII0075().new Solution();
        int[] ans = s.relativeSortArray(new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19}, new int[]{2, 1, 4, 2, 9, 6});
        System.out.println(Arrays.toString(ans));
    }
}