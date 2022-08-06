package leetcode.editor.cn.algorithm;

import java.util.Arrays;
import java.util.Random;

/**
 * Author: Deean
 * Date: 2022-08-06 10:07
 * Description: 1317. 将整数转换为两个无零整数的和
 */

public class P1317 {
    // code beginning
    class Solution {
        public int[] getNoZeroIntegers(int n) {
            int a = new Random().nextInt(n), b = n - a;
            while (hasZero(a) || hasZero(b)) {
                a = new Random().nextInt(n);
                b = n - a;
            }
            return new int[]{a, b};
        }

        private boolean hasZero(int n) {
            String str = String.valueOf(n);
            for (char c : str.toCharArray()) {
                if (c == '0') return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1317().new Solution();
        int[] ans = s.getNoZeroIntegers(10000);
        System.out.println(Arrays.toString(ans));
    }
}