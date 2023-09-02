package common;

/**
 * Author: Deean
 * Date: 2023-08-31 22:52
 * FileName: src/common
 * Description:2769. 找出最大的可达成数字
 */

public class P2769 {
    // code beginning
    class Solution {
        public int theMaximumAchievableX(int num, int t) {
            return num + t * 2;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2769().new Solution();
        Object ans = s.theMaximumAchievableX(4, 1);
        System.out.println(ans);
    }
}
