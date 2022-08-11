package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-11 22:22
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 1417. 重新格式化字符串
 */

public class P1417 {
    // code beginning
    class Solution {
        public String reformat(String s) {
            int count1 = 0, count2 = 0;
            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    count1++;
                } else {
                    count2++;
                }
            }
            if (Math.abs(count1 - count2) >= 2) return "";
            char[] arr = new char[s.length()];
            int index1 = 0, index2 = 1;
            if (count1 <= count2) {
                index1 = 1;
                index2 = 0;
            }
            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    arr[index1] = c;
                    index1 += 2;
                } else {
                    arr[index2] = c;
                    index2 += 2;
                }
            }
            return new String(arr);
        }
    }

    public static void main(String[] args) {
        Solution s = new P1417().new Solution();
        Object ans = s.reformat("covid2019");
        System.out.println(ans);
        ans = s.reformat("abcd123");
        System.out.println(ans);
    }
}