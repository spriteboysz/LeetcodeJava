package leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-08-12 21:54
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 2138. 将字符串拆分为若干长度为 k 的组
 */

public class P2138 {
    // code beginning
    class Solution {
        public String[] divideString(String s, int k, char fill) {
            int mod = s.length() % k;
            if (mod != 0) {
                s += String.valueOf(fill).repeat(k - mod);
            }
            List<String> divide = new ArrayList<>();
            for (int i = 0; i < s.length() / k; i++) {
                divide.add(s.substring(i * k, (i + 1) * k));
            }
            return divide.toArray(new String[0]);
        }
    }

    public static void main(String[] args) {
        Solution s = new P2138().new Solution();
        String[] ans = s.divideString("abcdefghij", 3, 'x');
        System.out.println(Arrays.toString(ans));
    }
}