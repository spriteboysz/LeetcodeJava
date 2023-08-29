package interview;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-12 22:59
 * LastEditTime: 2022-07-12 22:59
 * Description: 面试题40. 最小的k个数
 */

public class M00400000 {
    // code beginning
    class Solution {
        public int[] getLeastNumbers(int[] arr, int k) {
            Arrays.sort(arr);
            int[] nums = new int[k];
            System.arraycopy(arr, 0, nums, 0, k);
            return nums;
        }
    }

    public static void main(String[] args) {
        Solution s = new M00400000().new Solution();
        int[] ans = s.getLeastNumbers(new int[]{0, 1, 2, 1}, 1);
        System.out.println(Arrays.toString(ans));
    }
}