package leetcode.editor.cn.algorithm;

import static java.util.Arrays.binarySearch;

/**
 * Author: Deean
 * Date: 2022-08-16 23:11
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 704. 二分查找
 */

public class P0704 {
    // code beginning
    class Solution {
        public int search(int[] nums, int target) {
            return Math.max(-1, binarySearch(nums, target));
        }
    }

    public static void main(String[] args) {
        Solution s = new P0704().new Solution();
        Object ans = s.search(new int[]{-1, 0, 3, 5, 9, 12}, 2);
        System.out.println(ans);
    }
}