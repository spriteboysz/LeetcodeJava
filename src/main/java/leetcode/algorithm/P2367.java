package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-10 22:00
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description:
 */

public class P2367 {
    // code beginning
    class Solution {
        public int arithmeticTriplets(int[] nums, int diff) {
            int n = nums.length, count = 0;
            for (int i = 0; i < n - 2; i++) {
                for (int j = i + 1; j < n - 1; j++) {
                    if (nums[j] - nums[i] != diff) continue;
                    for (int k = j + 1; k < n; k++) {
                        if (nums[k] - nums[j] == diff) {
                            count++;
                        }
                    }
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2367().new Solution();
        Object ans = s.arithmeticTriplets(new int[]{4, 5, 6, 7, 8, 9}, 2);
        System.out.println(ans);
    }
}