package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-02 22:38
 * LastEditTime: 2022-07-02 22:38
 * Description: 2283. 判断一个数的数字计数是否等于数位的值
 */

public class P2283 {
    // code beginning
    class Solution {
        public boolean digitCount(String num) {
            for (int i = 0; i < num.length(); i++) {
                int number = num.charAt(i) - '0', count = 0;
                for (int j = 0; j < num.length(); j++) {
                    if (num.charAt(j) - '0' == i) count++;
                }
                if (count != number) return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2283().new Solution();
        Object ans = s.digitCount("1210");
        System.out.println(ans);
    }
}