package leetcode.sword;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-23 10:42
 * LastEditTime: 2022-07-23 10:42
 * Description: 剑指 Offer II 085. 生成匹配的括号
 */

public class OII0085 {
    // code beginning
    class Solution {
        List<String> parenthesis = new ArrayList<>();

        public List<String> generateParenthesis(int n) {
            if (n <= 0) return parenthesis;
            backtrace(n, "", 0, 0);
            return parenthesis;
        }

        private void backtrace(int n, String path, int open, int close) {
            if (open > n || close > open) return;
            if (path.length() == 2 * n) {
                parenthesis.add(path);
                return;
            }
            backtrace(n, path + "(", open + 1, close);
            backtrace(n, path + ")", open, close + 1);
        }
    }

    public static void main(String[] args) {
        Solution s = new OII0085().new Solution();
        Object ans = s.generateParenthesis(3);
        System.out.println(ans);
    }
}