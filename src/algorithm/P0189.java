package algorithm;

/**
 * Author: Deean
 * Date: 2022-08-29 22:45
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 189. 轮转数组
 */

public class P0189 {
    // code beginning
    class Solution {
        public void rotate(int[] nums, int k) {
            int[] clone = new int[nums.length];
            k %= nums.length;
            for (int i = 0; i < nums.length; i++) {
                clone[(i + k) % nums.length] = nums[i];
            }
            System.arraycopy(clone, 0, nums, 0, nums.length);
            // System.out.println(Arrays.toString(nums));
        }
    }

    public static void main(String[] args) {
        Solution s = new P0189().new Solution();
        s.rotate(new int[]{-1, -100, 3, 99}, 2);
    }
}