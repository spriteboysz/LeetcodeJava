package algorithm;

/**
 * Author: Deean
 * Date: 2023-08-29 18:48
 * FileName: src/algorithm
 * Description:2810. 故障键盘
 */

public class P2810 {
    // code beginning
    class Solution {
        public String finalString(String s) {
            StringBuilder ss = new StringBuilder();
            for (Character c : s.toCharArray()) {
                if (c == 'i') {
                    ss.reverse();
                } else {
                    ss.append(c);
                }
            }
            return ss.toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new P2810().new Solution();
        Object ans = s.finalString("string");
        System.out.println(ans);
    }
}
