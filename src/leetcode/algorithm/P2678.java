package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-03 18:37
 * FileName: src/leetcode/algorithm
 * Description:2678. 老人的数目
 */

public class P2678 {
    // code beginning
    class Solution {
        public int countSeniors(String[] details) {
            int cnt = 0;
            for (String detail : details) {
                if (Integer.parseInt(detail.substring(11, 13)) > 60) {
                    cnt++;
                }
            }
            return cnt;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2678().new Solution();
        Object ans = s.countSeniors(new String[]{"7868190130M7522", "5303914400F9211", "9273338290F4010"});
        System.out.println(ans);
    }
}
