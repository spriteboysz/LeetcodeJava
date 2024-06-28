package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2024-06-28 22:21
 * FileName: src/main/java/leetcode/algorithm
 * Description: 3190. 使所有元素都可以被 3 整除的最少操作数
 */

public class P3190 {
    // code beginning
    class Solution {
        public int minimumOperations(int[] nums) {
            int cnt = 0;
            for (int num : nums) {
                if (num % 3 != 0) {
                    cnt++;
                }
            }
            return cnt;
        }
    }

    public static void main(String[] args) {
        Solution s = new P3190().new Solution();
        var ans = s.minimumOperations(new int[]{1, 2, 3, 4});
        System.out.println(ans);
    }
}
