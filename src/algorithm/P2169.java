package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-03 23:08
 * LastEditTime: 2022-07-03 23:08
 * Description: 2169. 得到 0 的操作数
 */

public class P2169 {
    // code beginning
    class Solution {
        public int countOperations(int num1, int num2) {
            int count = 0;
            while (num1 != 0 && num2 != 0) {
                if (num1 > num2) {
                    num1 -= num2;
                } else {
                    num2 -= num1;
                }
                count++;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2169().new Solution();
        Object ans = s.countOperations(2, 3);
        System.out.println(ans);
    }
}