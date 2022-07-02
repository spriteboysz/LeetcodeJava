package leetcode.editor.cn.sword;

/**
 * Author: Deean
 * Date: 2022-07-02 20:49
 * LastEditTime: 2022-07-02 20:49
 * Description: .
 */

public class O0058II {
    // code beginning
    class Solution {
        public String reverseLeftWords(String s, int n) {
            return s.substring(n) + s.substring(0, n);
        }
    }

    public static void main(String[] args) {
        Solution s = new O0058II().new Solution();
        Object ans = s.reverseLeftWords("lrloseumgh", 6);
        System.out.println(ans);
    }
}