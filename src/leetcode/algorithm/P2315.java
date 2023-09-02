package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-06-29 23:51
 * LastEditTime: 2022-06-29 23:51
 * Description: 2315. 统计星号
 */

public class P2315 {
    // code beginning
    class Solution {
        public int countAsterisks(String s) {
            int count = 0;
            String[] list = s.split("\\|");
            for (int i = 0; i < list.length; i += 2) {
                for (int j = 0; j < list[i].length(); j++) {
                    if ('*' == list[i].charAt(j)) count++;
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2315().new Solution();
        Object ans = s.countAsterisks("yo|uar|e**|b|e***au|tifu|l");
        System.out.println(ans);
    }
}