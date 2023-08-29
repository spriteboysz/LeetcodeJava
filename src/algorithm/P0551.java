package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-16 10:29
 * LastEditTime: 2022-07-16 10:29
 * Description: 551. 学生出勤记录 I
 */

public class P0551 {
    // code beginning
    class Solution {
        public boolean checkRecord(String s) {
            return s.indexOf("A") == s.lastIndexOf("A") && !s.contains("LLL");
        }
    }

    public static void main(String[] args) {
        Solution s = new P0551().new Solution();
        Object ans = s.checkRecord("PPALLL");
        System.out.println(ans);
    }
}