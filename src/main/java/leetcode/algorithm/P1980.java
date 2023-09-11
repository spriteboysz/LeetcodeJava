package leetcode.algorithm;

import java.util.Collections;
import java.util.HashSet;

/**
 * Author: Deean
 * Date: 2023-09-10 16:26
 * FileName: src/leetcode/algorithm
 * Description:1980. 找出不同的二进制字符串
 */

public class P1980 {
    // code beginning
    class Solution {
        public String findDifferentBinaryString(String[] nums) {
            HashSet<String> seen = new HashSet<>();
            Collections.addAll(seen, nums);
            for (int i = 0, n = nums[0].length(); i < Math.pow(2, n); i++) {
                StringBuilder ss = new StringBuilder();
                for (int j = 0, k = i; j < n; j++) {
                    ss.append(k & 1);
                    k >>= 1;
                }
                if (!seen.contains(ss.toString())) {
                    return ss.toString();
                }
            }
            return null;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1980().new Solution();
        var ans = s.findDifferentBinaryString(new String[]{"111", "011", "001"});
        System.out.println(ans);
    }
}
