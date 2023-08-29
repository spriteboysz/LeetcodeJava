package algorithm;

/**
 * Author: @Deean
 * Date: 2022-06-23 23:12
 * LastEditTime: 2022-06-23 23:12
 * Description: 字符串中的单词数
 */

public class P0434 {
    // code beginning
    class Solution {
        public int countSegments(String s) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if ((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' ') {
                    count += 1;
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0434().new Solution();
        Object ans = s.countSegments("Hello, my name is John");
        System.out.println(ans);
        ans = s.countSegments("");
        System.out.println(ans);
        ans = s.countSegments("a   b");
        System.out.println(ans);
    }
}