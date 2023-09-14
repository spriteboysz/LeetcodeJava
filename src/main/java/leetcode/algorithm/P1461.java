package leetcode.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2023-09-13 22:01
 * FileName: src/main/java/leetcode/algorithm
 * Description:1461. 检查一个字符串是否包含所有长度为 K 的二进制子串
 */

public class P1461 {
    // code beginning
    class Solution {
        public boolean hasAllCodes(String s, int k) {
            if (s.length() < (1 << k) + k - 1) {
                return false;
            }
            Set<String> seen = new HashSet<>();
            for (int i = 0; i + k <= s.length(); i++) {
                seen.add(s.substring(i, i + k));
            }
            return seen.size() == (1 << k);
        }
    }

    public static void main(String[] args) {
        Solution s = new P1461().new Solution();
        var ans = s.hasAllCodes("00110110", 2);
        System.out.println(ans);
    }
}
