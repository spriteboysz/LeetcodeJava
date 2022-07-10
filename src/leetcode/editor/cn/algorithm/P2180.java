package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-10 22:02
 * LastEditTime: 2022-07-10 22:02
 * Description: 2180. 统计各位数字之和为偶数的整数个数
 */

public class P2180 {
    // code beginning
    class Solution {
        public int countEven(int num) {
            int count = 0;
            for (int i = 2; i <= num; i++) {
                if (isEven(i)) count++;
            }
            return count;
        }

        private boolean isEven(int num) {
            int sum = 0;
            while (num != 0) {
                sum += (num % 10);
                num /= 10;
            }
            return sum % 2 == 0;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2180().new Solution();
        Object ans = s.countEven(30);
        System.out.println(ans);
    }
}