package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-09-10 16:19
 * FileName: src/leetcode/algorithm
 * Description:1985. 找出数组中的第 K 大整数
 */

public class P1985 {
    // code beginning
    class Solution {
        public String kthLargestNumber(String[] nums, int k) {
            Arrays.sort(nums, (a, b) ->
                    a.length() == b.length() ? a.compareTo(b) : a.length() - b.length()
            );
            return nums[nums.length - k];
        }
    }

    public static void main(String[] args) {
        Solution s = new P1985().new Solution();
        var ans = s.kthLargestNumber(new String[]{"2", "21", "12", "1"}, 3);
        System.out.println(ans);
    }
}
