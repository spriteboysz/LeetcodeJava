package leetcode.LCP;

/**
 * Author: Deean
 * Date: 2023-09-27 23:40
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 012. 寻找数组的中心下标
 */

public class LCR0012 {
    // code beginning
    class Solution {
        public int pivotIndex(int[] nums) {
            int sum = 0, acc = 0;
            for (int num : nums) {
                sum += num;
            }
            for (int i = 0, n = nums.length; i < n; i++) {
                if (2 * acc + nums[i] == sum) {
                    return i;
                }
                acc += nums[i];
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0012().new Solution();
        var ans = s.pivotIndex(new int[]{1, 7, 3, 6, 5, 6});
        System.out.println(ans);
    }
}
