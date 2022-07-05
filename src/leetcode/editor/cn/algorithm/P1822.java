package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-05 22:57
 * LastEditTime: 2022-07-05 22:57
 * Description: 1822. 数组元素积的符号
 */

public class P1822 {
    // code beginning
    class Solution {
        public int arraySign(int[] nums) {
            int count = 0;
            for (int num : nums) {
                if (num == 0) return 0;
                if (num < 0) count++;
            }
            return count % 2 == 0 ? 1 : -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1822().new Solution();
        Object ans = s.arraySign(new int[]{-1, 1, -1, 1, -1});
        System.out.println(ans);
        ans = s.arraySign(new int[]{1, 5, 0, 2, -3});
        System.out.println(ans);
    }
}