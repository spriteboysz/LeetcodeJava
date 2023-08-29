package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-13 22:00
 * LastEditTime: 2022-07-13 22:00
 * Description: 1995. 统计特殊四元组
 */

public class P1995 {
    // code beginning
    class Solution {
        public int countQuadruplets(int[] nums) {
            int count = 0;
            for (int a = 0; a < nums.length - 3; a++) {
                for (int b = a + 1; b < nums.length - 2; b++) {
                    for (int c = b + 1; c < nums.length - 1; c++) {
                        for (int d = c + 1; d < nums.length; d++) {
                            if (nums[a] + nums[b] + nums[c] == nums[d]) count++;
                        }
                    }
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1995().new Solution();
        Object ans = s.countQuadruplets(new int[]{1, 1, 1, 3, 5});
        System.out.println(ans);
    }
}