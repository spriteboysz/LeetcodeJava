package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-17 22:15
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 747. 至少是其他数字两倍的最大数
 */

public class P0747 {
    // code beginning
    class Solution {
        public int dominantIndex(int[] nums) {
            if (nums.length == 1) return 0;
            int a = -1, b = 0;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > nums[b]) {
                    a = b;
                    b = i;
                } else if (a == -1 || nums[i] > nums[a]) {
                    a = i;
                }
            }
            return nums[b] >= nums[a] * 2 ? b : -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0747().new Solution();
        Object ans = s.dominantIndex(new int[]{1, 2, 3, 4});
        System.out.println(ans);
    }
}