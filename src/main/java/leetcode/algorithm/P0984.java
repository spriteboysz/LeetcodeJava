package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-15 22:01
 * FileName: src/main/java/leetcode/algorithm
 * Description:984. 不含 AAA 或 BBB 的字符串
 */

public class P0984 {
    // code beginning
    class Solution {
        public String strWithout3a3b(int a, int b) {
            StringBuilder ss = new StringBuilder();
            while (a > 0 && b > 0) {
                if (a > b) {
                    ss.append("aab");
                    a -= 2;
                    b -= 1;
                } else if (a < b) {
                    ss.append("bba");
                    a -= 1;
                    b -= 2;
                } else {
                    ss.append("ab");
                    a--;
                    b--;
                }
            }
            while(a > 0) {
                ss.append('a');
                a--;
            }
            while(b > 0) {
                ss.append('b');
                b--;
            }
            return ss.toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new P0984().new Solution();
        var ans = s.strWithout3a3b(4, 3);
        System.out.println(ans);
    }
}
