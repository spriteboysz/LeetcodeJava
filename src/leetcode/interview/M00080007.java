package leetcode.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-23 11:25
 * LastEditTime: 2022-07-23 11:25
 * Description: 面试题 08.07. 无重复字符串的排列组合
 */

public class M00080007 {
    // code beginning
    class Solution {
        List<String> words = new ArrayList<>();

        public String[] permutation(String s) {
            backtrace(s, "");
            return words.toArray(new String[0]);
        }

        private void backtrace(String s, String path) {
            if (s.length() == path.length()) {
                words.add(path);
                return;
            }
            for (int i = 0; i < s.length(); i++) {
                if (path.contains(String.valueOf(s.charAt(i)))) continue;
                path += s.charAt(i);
                backtrace(s, path);
                path = path.substring(0, path.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new M00080007().new Solution();
        Object[] ans = s.permutation("qwe");
        System.out.println(Arrays.toString(ans));
    }
}