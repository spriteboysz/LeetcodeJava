package leetcode.algorithm;

/**
 * Author: @Deean
 * Date: 2022-06-22 23:54
 * LastEditTime: 2022-06-22 23:54
 * Description: 字符串中的第一个唯一字符
 */

public class P0387 {
    // code beginning
    class Solution {
        public int firstUniqChar(String s) {
            char[] chars = new char[26];
            for (int i = 0; i < s.length(); i++) {
                chars[s.charAt(i) - 97] += 1;
            }
            for (int i = 0; i < s.length(); i++) {
                if (chars[s.charAt(i) - 97] == 1) {
                    return i;
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0387().new Solution();
        Object ans = s.firstUniqChar("loveleetcode");
        System.out.println(ans);
        ans = s.firstUniqChar("aabb");
        System.out.println(ans);
    }
}