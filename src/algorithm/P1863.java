package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-19 23:45
 * LastEditTime: 2022-07-19 23:45
 * Description: 1863. 找出所有子集的异或总和再求和
 */

public class P1863 {
    // code beginning
    class Solution {
        public int subsetXORSum(int[] nums) {
            int sum = 0;
            for (int i = 0; i < Math.pow(2, nums.length); i++) {
                int cur = 0;
                for (int j = 0; j < nums.length; j++) {
                    if ((i & (1 << j)) != 0) cur ^= nums[j];
                }
                sum += cur;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1863().new Solution();
        Object ans = s.subsetXORSum(new int[]{3, 4, 5, 6, 7, 8});
        System.out.println(ans);
    }
}