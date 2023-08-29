package algorithm;

/**
 * Author: Deean
 * Date: 2022-06-29 22:59
 * LastEditTime: 2022-06-29 22:59
 * Description: 2011. 执行操作后的变量值
 */

public class P2011 {
    // code beginning
    class Solution {
        public int finalValueAfterOperations(String[] operations) {
            int value = 0;
            for (String operation : operations) {
                value += (operation.charAt(1) == '+') ? 1 : -1;
            }
            return value;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2011().new Solution();
        Object ans = s.finalValueAfterOperations(new String[]{"++X", "++X", "X++"});
        System.out.println(ans);
    }
}