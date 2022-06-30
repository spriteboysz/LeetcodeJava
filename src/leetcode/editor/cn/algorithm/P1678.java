package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-06-30 23:34
 * LastEditTime: 2022-06-30 23:34
 * Description: 1678. 设计 Goal 解析器
 */

public class P1678 {
    // code beginning
    class Solution {
        public String interpret(String command) {
            return command.replace("(al)", "al").replace("()", "o");
        }
    }

    public static void main(String[] args) {
        Solution s = new P1678().new Solution();
        Object ans = s.interpret("(al)G(al)()()G");
        System.out.println(ans);
    }
}