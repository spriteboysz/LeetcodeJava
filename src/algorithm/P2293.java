package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-20 23:28
 * LastEditTime: 2022-07-20 23:28
 * Description: 2293. 极大极小游戏
 */

public class P2293 {
    // code beginning
    class Solution {
        public int minMaxGame(int[] nums) {
            int n = nums.length;
            while (n != 1) {
                int count = 0;
                for (int i = 0; i < n; i += 2) {
                    if (count % 2 == 0) {
                        nums[count] = Math.min(nums[i], nums[i + 1]);
                    } else {
                        nums[count] = Math.max(nums[i], nums[i + 1]);
                    }
                    count++;
                }
                n = count;
            }
            return nums[0];
        }
    }

    public static void main(String[] args) {
        Solution s = new P2293().new Solution();
        Object ans = s.minMaxGame(new int[]{1, 3, 5, 2, 4, 8, 2, 2});
        System.out.println(ans);
    }
}