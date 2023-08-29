package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-14 22:56
 * LastEditTime: 2022-07-14 22:56
 * Description: 1021. 删除最外层的括号
 */

public class P1021 {
    // code beginning
    class Solution {
        public String removeOuterParentheses(String s) {
            int count = 0;
            StringBuilder builder = new StringBuilder();
            StringBuilder temp = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (c == '(') count++;
                if (c == ')') count--;
                temp.append(c);
                if (count == 0) {
                    builder.append(temp, 1, temp.length() - 1);
                    temp.delete(0, temp.length());
                }
            }
            return builder.toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new P1021().new Solution();
        Object ans = s.removeOuterParentheses("(()())(())(()(()))");
        System.out.println(ans);
        ans = s.removeOuterParentheses("()()");
        System.out.println(ans);
    }
}