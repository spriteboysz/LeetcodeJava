package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-28 10:59
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 1894. 找到需要补充粉笔的学生编号
 */

public class P1894 {
    // code beginning
    class Solution {
        public int chalkReplacer(int[] chalk, int k) {
            long sum = 0;
            for (int num : chalk) sum += num;
            k %= sum;
            for (int i = 0; i < chalk.length; i++) {
                if (chalk[i] <= k) {
                    k -= chalk[i];
                } else {
                    return i;
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1894().new Solution();
        Object ans = s.chalkReplacer(new int[]{3, 4, 1, 2}, 25);
        System.out.println(ans);
    }
}