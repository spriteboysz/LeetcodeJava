package leetcode.editor.cn.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-10 00:08
 * LastEditTime: 2022-07-10 00:08
 * Description: 1502. 判断能否形成等差数列
 */

public class P1502 {
    // code beginning
    class Solution {
        public boolean canMakeArithmeticProgression(int[] arr) {
            if (arr.length == 2) return true;
            Arrays.sort(arr);
            int difference = arr[1] - arr[0];
            for (int i = 2; i < arr.length; i++) {
                if (arr[i] - arr[i - 1] != difference) return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1502().new Solution();
        Object ans = s.canMakeArithmeticProgression(new int[]{3, 5, 1});
        System.out.println(ans);
    }
}