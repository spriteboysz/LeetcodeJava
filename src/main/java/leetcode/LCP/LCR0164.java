package leetcode.LCP;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-09-30 22:00
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 164. 破解闯关密码
 */

public class LCR0164 {
    // code beginning
    class Solution {
        public String crackPassword(int[] nums) {
            String[] ss = new String[nums.length];
            for (int i = 0; i < nums.length; i++) {
                ss[i] = String.valueOf(nums[i]);
            }
            Arrays.sort(ss, (a, b) -> (a + b).compareTo(b + a));
            return String.join("", ss);
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0164().new Solution();
        var ans = s.crackPassword(new int[]{0, 3, 30, 34, 5, 9});
        System.out.println(ans);
    }
}
