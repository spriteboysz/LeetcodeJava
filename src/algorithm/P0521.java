package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-14 23:30
 * LastEditTime: 2022-07-14 23:30
 * Description: 521. 最长特殊序列 Ⅰ
 */

public class P0521 {
    // code beginning
    class Solution {
        public int findLUSlength(String a, String b) {
            if (!a.equals(b)) {
                return Math.max(a.length(), b.length());
            } else {
                return -1;
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new P0521().new Solution();
        Object ans = s.findLUSlength("aaa", "bbb");
        System.out.println(ans);
        ans = s.findLUSlength("aaa", "aaa");
        System.out.println(ans);
    }
}