package leetcode.editor.cn.interview;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-23 11:20
 * LastEditTime: 2022-07-23 11:20
 * Description: 面试题 08.09. 括号
 */

public class M00080009 {
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
            if (path.length() == n * 2) {
                parenthesis.add(path);
                return;
            }
            backtrace(n, path + "(", left + 1, right);
            backtrace(n, path + ")", left, right + 1);
        }
    }

    public static void main(String[] args) {
        Solution s = new M00080009().new Solution();
        Object ans = s.generateParenthesis(3);
        System.out.println(ans);
    }
}