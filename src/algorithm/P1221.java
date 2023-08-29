package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-01 21:02
 * LastEditTime: 2022-07-01 21:02
 * Description: 1221. 分割平衡字符串
 */

public class P1221 {
    // code beginning
    class Solution {
        public int balancedStringSplit(String s) {
            int count = 0, cur = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == 'R') {
                    cur++;
                } else {
                    cur--;
                }
                if (cur == 0) count++;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1221().new Solution();
        Object ans = s.balancedStringSplit("RLLLLRRRLR");
        System.out.println(ans);    // 3
        ans = s.balancedStringSplit("RLRRRLLRLL");
        System.out.println(ans);
    }
}