package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-16 17:12
 * FileName: src/main/java/leetcode/algorithm
 * Description:33. 搜索旋转排序数组
 */

public class P0033 {
    // code beginning
    class Solution {
        public int search(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    return i;
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0033().new Solution();
        var ans = s.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0);
        System.out.println(ans);
    }
}
