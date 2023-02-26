package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2023-02-26 11:27
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 2535. 数组元素和与数字和的绝对差
 */

public class P2535 {
    // code beginning
    class Solution {
        public int differenceOfSum(int[] nums) {
            int sum1 = 0, sum2 = 0;
            for (int num : nums) {
                sum1 += num;
                while (num > 0) {
                    sum2 += num % 10;
                    num /= 10;
                }
            }
            return Math.abs(sum1 - sum2);
        }
    }

    public static void main(String[] args) {
        Solution s = new P2535().new Solution();
        Object ans = s.differenceOfSum(new int[]{1, 15, 6, 3});
        System.out.println(ans);
    }
}
