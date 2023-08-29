package algorithm;

/**
 * Author: Deean
 * Date: 2022-08-13 21:17
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 1784. 检查二进制字符串字段
 */

public class P1784 {
    // code beginning
    class Solution {
        public boolean checkOnesSegment(String s) {
            return !s.contains("01");
        }
    }

    public static void main(String[] args) {
        Solution s = new P1784().new Solution();
        Object ans = s.checkOnesSegment("1001");
        System.out.println(ans);
    }
}