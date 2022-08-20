package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-20 22:53
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 55. 跳跃游戏
 */

public class P0055 {
    // code beginning
    class Solution {
        public boolean canJump(int[] nums) {
            int rightmost = 0;
            for (int i = 0; i < nums.length; i++) {
                if (i <= rightmost) {
                    rightmost = Math.max(rightmost, i + nums[i]);
                    if (rightmost >= nums.length - 1) return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0055().new Solution();
        Object ans = s.canJump(new int[]{3, 2, 1, 0, 4});
        System.out.println(ans);
    }
}