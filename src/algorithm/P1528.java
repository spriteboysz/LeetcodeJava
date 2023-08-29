package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-03 16:24
 * LastEditTime: 2022-07-03 16:24
 * Description: 1528. 重新排列字符串
 */

public class P1528 {
    // code beginning
    class Solution {
        public String restoreString(String s, int[] indices) {
            char[] str = new char[s.length()];
            for (int i = 0; i < s.length(); i++) {
                str[indices[i]] = s.charAt(i);
            }
            return String.valueOf(str);
        }
    }

    public static void main(String[] args) {
        Solution s = new P1528().new Solution();
        Object ans = s.restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3});
        System.out.println(ans);
    }
}