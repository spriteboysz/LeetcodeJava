package algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-08-27 22:08
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 949. 给定数字能组成的最大时间
 */

public class P0949 {
    // code beginning
    class Solution {
        public String largestTimeFromDigits(int[] arr) {
            Arrays.sort(arr);
            StringBuilder builder = new StringBuilder();
            for (int i : arr) {
                builder.append(i);
            }
            String s = builder.toString();

            for (int i = 24 * 60 - 1; i >= 0; i--) {
                int hh = i / 60, mm = i % 60;
                StringBuilder cur = new StringBuilder();
                if (hh < 10) cur.append(0);
                if (mm < 10) cur.append(0);
                cur.append(hh).append(mm);
                char[] chars = cur.toString().toCharArray();
                Arrays.sort(chars);
                if (new String(chars).equals(s)) {
                    return String.format("%02d:%02d", i / 60, i % 60);
                }
            }
            return "";
        }
    }

    public static void main(String[] args) {
        Solution s = new P0949().new Solution();
        Object ans = s.largestTimeFromDigits(new int[]{0, 0, 1, 0});
        System.out.println(ans);
    }
}