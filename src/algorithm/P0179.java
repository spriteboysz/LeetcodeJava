package algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-08-29 22:57
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 179. 最大数
 */

public class P0179 {
    // code beginning
    class Solution {
        public String largestNumber(int[] nums) {
            String[] ss = new String[nums.length];
            for (int i = 0; i < nums.length; i++) ss[i] = String.valueOf(nums[i]);
            Arrays.sort(ss, (a, b) -> {
                String sa = a + b, sb = b + a;
                return sb.compareTo(sa);
            });
            String s = String.join("", ss);
            int k = 0;
            while (k < nums.length - 1 && s.charAt(k) == '0') k++;
            return s.substring(k);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0179().new Solution();
        Object ans = s.largestNumber(new int[]{3, 30, 34, 5, 9});
        System.out.println(ans);
    }
}