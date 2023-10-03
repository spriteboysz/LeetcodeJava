package leetcode.LCP;

/**
 * Author: Deean
 * Date: 2023-09-30 21:42
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 182. 动态口令
 */

public class LCR0182 {
    // code beginning
    class Solution {
        public String dynamicPassword(String password, int target) {
            return password.substring(target) + password.substring(0, target);
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0182().new Solution();
        var ans = s.dynamicPassword("s3cur1tyC0d3", 4);
        System.out.println(ans);
    }
}
