package leetcode.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-11 23:01
 * FileName: src/leetcode/common
 * Description:1807. 替换字符串中的括号内容
 */

public class P1807 {
    // code beginning
    class Solution {
        public String evaluate(String s, List<List<String>> knowledge) {
            HashMap<String, String> hash = new HashMap<>();
            for (List<String> el : knowledge) {
                hash.put(el.get(0), el.get(1));
            }
            StringBuilder ss = new StringBuilder(), stack = new StringBuilder();
            boolean flag = false;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    stack.delete(0, stack.length());
                    flag = true;
                } else if (s.charAt(i) == ')') {
                    ss.append(hash.getOrDefault(stack.toString(), "?"));
                    flag = false;
                } else if (flag) {
                    stack.append(s.charAt(i));
                } else {
                    ss.append(s.charAt(i));
                }
            }
            return ss.toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new P1807().new Solution();
        List<List<String>> knowledge = new ArrayList<>();
        List<String> row1 = new ArrayList<>(), row2 = new ArrayList<>();
        row1.add("name");
        row1.add("bob");
        knowledge.add(row1);
        row2.add("age");
        row2.add("two");
        knowledge.add(row2);
        var ans = s.evaluate("(name) is (age) years old", knowledge);
        System.out.println(ans);
    }
}
