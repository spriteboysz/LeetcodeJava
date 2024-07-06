package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2024-07-06 14:26
 * FileName: src/main/java/leetcode/algorithm
 * Description: 3038. 相同分数的最大操作数目 I
 */

public class P3038 {
    // code beginning
    class Solution {
        public int maxOperations(int[] nums) {
            int target = nums[0] + nums[1];
            int cnt = 0;
            for (int i = 0; i < nums.length - 1; i += 2) {
                if (nums[i] + nums[i + 1] == target) {
                    cnt += 1;
                } else {
                    break;
                }
            }
            return cnt;
        }
    }

    public static void main(String[] args) {
        Solution s = new P3038().new Solution();
        var ans = s.maxOperations(new int[]{3, 2, 1, 4, 5});
        System.out.println(ans);
    }
}
