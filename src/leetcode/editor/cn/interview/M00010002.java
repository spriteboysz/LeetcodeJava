package leetcode.editor.cn.interview;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-15 23:30
 * LastEditTime: 2022-07-15 23:30
 * Description: 面试题 01.02. 判定是否互为字符重排
 */

public class M00010002 {
    // code beginning
    class Solution {
        public boolean CheckPermutation(String s1, String s2) {
            if (s1.length() != s2.length()) return false;
            char[] ch1 = s1.toCharArray(), ch2 = s2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            return String.valueOf(ch1).equals(String.valueOf(ch2));
        }
    }

    public static void main(String[] args) {
        Solution s = new M00010002().new Solution();
        Object ans = s.CheckPermutation("abc", "bca");
        System.out.println(ans);
        ans = s.CheckPermutation("abc", "bda");
        System.out.println(ans);
    }
}