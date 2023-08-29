package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-21 23:28
 * LastEditTime: 2022-07-21 23:28
 * Description: 1910. 删除一个字符串中所有出现的给定子字符串
 */

public class P1910 {
    // code beginning
    class Solution {
        public String removeOccurrences(String s, String part) {
            while (s.contains(part)) {
                int i = s.indexOf(part);
                s = s.substring(0, i) + s.substring(i + part.length());
            }
            return s;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1910().new Solution();
        Object ans = s.removeOccurrences("axxxxyyyyb", "xy");
        System.out.println(ans);
    }
}