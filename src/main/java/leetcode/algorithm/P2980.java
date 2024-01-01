package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2024-01-01 11:32
 * FileName: src/main/java/leetcode/algorithm
 * Description: 2980. 检查按位或是否存在尾随零
 */

public class P2980 {
    // code beginning
    class Solution {
        public boolean hasTrailingZeros(int[] nums) {
            int cnt = 0;
            for (int num : nums) {
                if (num % 2 == 0) {
                    cnt++;
                }
            }
            return cnt >= 2;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2980().new Solution();
        var ans = s.hasTrailingZeros(new int[]{1, 2, 3, 4, 5});
        System.out.println(ans);
    }
}
