package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-09-16 15:13
 * FileName: src/main/java/leetcode/algorithm
 * Description:324. 摆动排序 II
 */

public class P0324 {
    // code beginning
    class Solution {
        public void wiggleSort(int[] nums) {
            int[] arr = nums.clone();
            Arrays.sort(arr);
            int n = nums.length;
            int x = (n + 1)/2;
            for (int i = 0, j = x - 1, k = n - 1; i < n; i += 2, j--, k--) {
                nums[i] = arr[j];
                if (i + 1 < n) {
                    nums[i + 1] = arr[k];
                }
            }
            System.out.println(Arrays.toString(nums));
        }
    }

    public static void main(String[] args) {
        Solution s = new P0324().new Solution();
        s.wiggleSort(new int[]{1, 5, 1, 1, 6, 4});
        System.out.println();
    }
}
