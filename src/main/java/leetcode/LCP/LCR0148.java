package leetcode.LCP;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Author: Deean
 * Date: 2023-09-30 16:00
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 148. 验证图书取出顺序
 */

public class LCR0148 {
    // code beginning
    class Solution {
        public boolean validateBookSequences(int[] putIn, int[] takeOut) {
            Deque<Integer> stack = new LinkedList<>();
            int pos = 0;
            for (int num : putIn) {
                stack.push(num);
                while (!stack.isEmpty() && stack.peek() == takeOut[pos]) {
                    stack.pop();
                    pos++;
                }
            }
            return stack.isEmpty() && pos == putIn.length;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0148().new Solution();
        var ans = s.validateBookSequences(new int[]{6,7,8,9,10,11}, new int[]{9,11,10,8,7,6});
        System.out.println(ans);
    }
}
