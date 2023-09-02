package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-02 09:54
 * FileName: src/leetcode.common
 * Description:2733. 既不是最小值也不是最大值
 */

public class P2733 {
    // code beginning
    class Solution {
        public int findNonMinOrMax(int[] nums) {
            int maximum = Integer.MIN_VALUE, minimum = Integer.MAX_VALUE;
            for (int num : nums) {
                maximum = Math.max(maximum, num);
                minimum = Math.min(minimum, num);
            }
            for (int num : nums) {
                if (num != maximum && num != minimum) {
                    return num;
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2733().new Solution();
        Object ans = s.findNonMinOrMax(new int[]{3, 2, 1, 4});
        System.out.println(ans);
    }
}
