package leetcode.editor.cn.LCP;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-08-14 21:35
 * FileName: src/leetcode/editor/cn/LCP
 * Description: LCP 02. 分式化简
 */

public class LCP0002 {
    // code beginning
    class Solution {
        public int[] fraction(int[] cont) {
            int denominator = 1, numerator = cont[cont.length - 1];
            for (int i = cont.length - 2; i >= 0; i--) {
                int temp = denominator;
                denominator = numerator;
                numerator = temp;
                numerator += cont[i] * denominator;
            }
            return new int[]{numerator, denominator};
        }
    }

    public static void main(String[] args) {
        Solution s = new LCP0002().new Solution();
        int[] ans = s.fraction(new int[]{0, 0, 3});
        System.out.println(Arrays.toString(ans));
    }
}