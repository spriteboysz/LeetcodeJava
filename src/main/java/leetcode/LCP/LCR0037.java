package leetcode.LCP;

import java.util.Arrays;
import java.util.Stack;

/**
 * Author: Deean
 * Date: 2023-09-29 16:39
 * FileName: src/main/java/leetcode/algorithm
 * Description:LCR 037. 行星碰撞
 */

public class LCR0037 {
    // code beginning
    class Solution {
        public int[] asteroidCollision(int[] asteroids) {
            Stack<Integer> stack = new Stack<>();
            for (int asteroid : asteroids) {
                while (!stack.empty() && stack.peek() > 0 && stack.peek() < -asteroid) {
                    stack.pop();
                }
                if (!stack.empty() && asteroid < 0 && stack.peek() == -asteroid) {
                    stack.pop();
                } else if (asteroid > 0 || stack.empty() || stack.peek() < 0) {
                    stack.push(asteroid);
                }
            }
            return stack.stream().mapToInt(i -> i).toArray();
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0037().new Solution();
        var ans = s.asteroidCollision(new int[]{5, 10, -5});
        System.out.println(Arrays.toString(ans));
    }
}
