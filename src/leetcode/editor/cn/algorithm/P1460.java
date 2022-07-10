package leetcode.editor.cn.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-10 12:00
 * LastEditTime: 2022-07-10 12:00
 * Description: 1460. 通过翻转子数组使两个数组相等
 */

public class P1460 {
    // code beginning
    class Solution {
        public boolean canBeEqual(int[] target, int[] arr) {
            Arrays.sort(target);
            Arrays.sort(arr);
            for (int i = 0; i < target.length; i++) {
                if (target[i] != arr[i]) return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1460().new Solution();
        Object ans = s.canBeEqual(new int[]{3, 7, 9}, new int[]{7, 3, 9});
        System.out.println(ans);
        ans = s.canBeEqual(new int[]{3, 7, 9}, new int[]{7, 3, 11});
        System.out.println(ans);
    }
}