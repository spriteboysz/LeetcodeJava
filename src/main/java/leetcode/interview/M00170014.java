package leetcode.interview;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-08-14 22:23
 * FileName: src/leetcode/editor/cn/leetcode.interview
 * Description: 面试题 17.14. 最小K个数
 */

public class M00170014 {
    // code beginning
    class Solution {
        public int[] smallestK(int[] arr, int k) {
            Arrays.sort(arr);
            int[] small = new int[k];
            System.arraycopy(arr, 0, small, 0, k);
            return small;
        }
    }

    public static void main(String[] args) {
        Solution s = new M00170014().new Solution();
        int[] ans = s.smallestK(new int[]{1, 3, 5, 7, 2, 4, 6, 8}, 4);
        System.out.println(Arrays.toString(ans));
    }
}