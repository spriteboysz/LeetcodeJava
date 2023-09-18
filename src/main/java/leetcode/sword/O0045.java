package leetcode.sword;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-09-17 14:18
 * FileName: src/main/java/leetcode/sword
 * Description:剑指 Offer 45. 把数组排成最小的数
 */

public class O0045 {
    // code beginning
    class Solution {
        public String minNumber(int[] nums) {
            String[] ss = new String[nums.length];
            for (int i = 0; i < nums.length; i++) {
                ss[i] = String.valueOf(nums[i]);
            }
            Arrays.sort(ss, (a, b) -> (a + b).compareTo(b + a));
            return String.join("", ss);
        }
    }

    public static void main(String[] args) {
        Solution s = new O0045().new Solution();
        var ans = s.minNumber(new int[]{3, 30, 34, 5, 9});
        System.out.println(ans);
    }
}
