package leetcode.editor.cn.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-23 11:06
 * LastEditTime: 2022-07-23 11:06
 * Description: 22. 括号生成
 */

public class P0022 {
    // code beginning
    class Solution {
        List<String> parenthesis = new ArrayList<>();

        public List<String> generateParenthesis(int n) {
            if (n <= 0) return parenthesis;
            backtrace(n, "", 0, 0);
            return parenthesis;
        }

        private void backtrace(int n, String path, int left, int right) {
            if (left > n || right > left) return;
            if (path.length() == 2 * n) {
                parenthesis.add(path);
                return;
            }
            backtrace(n, path + "(", left + 1, right);
            backtrace(n, path + ")", left, right + 1);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0022().new Solution();
        Object ans = s.generateParenthesis(4);
        System.out.println(ans);
    }
}