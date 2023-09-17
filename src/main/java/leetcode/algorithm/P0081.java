package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-16 16:04
 * FileName: src/main/java/leetcode/algorithm
 * Description:81. 搜索旋转排序数组 II
 */

public class P0081 {
    // code beginning
    class Solution {
        public boolean search(int[] nums, int target) {
            for (int num : nums) {
                if (num == target) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0081().new Solution();
        var ans = s.search(new int[]{2, 5, 6, 0, 0, 1, 2}, 0);
        System.out.println(ans);
    }
}
