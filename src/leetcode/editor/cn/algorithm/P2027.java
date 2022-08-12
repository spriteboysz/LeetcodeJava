package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-12 22:47
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 2027. 转换字符串的最少操作次数
 */

public class P2027 {
    // code beginning
    class Solution {
        public int minimumMoves(String s) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'X') {
                    count++;
                    i += 2;
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2027().new Solution();
        Object ans = s.minimumMoves("XXOX");
        System.out.println(ans);
    }
}