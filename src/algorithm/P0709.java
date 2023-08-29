package algorithm;

/**
 * Author: Deean
 * Date: 2022-06-28 23:55
 * LastEditTime: 2022-06-28 23:55
 * Description: 709. 转换成小写字母
 */

public class P0709 {
    // code beginning
    class Solution {
        public String toLowerCase(String s) {
            return s.toLowerCase();
        }
    }

    public static void main(String[] args) {
        Solution s = new P0709().new Solution();
        Object ans = s.toLowerCase("Hello");
        System.out.println(ans);
    }
}