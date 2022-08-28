package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-28 10:23
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 1041. 困于环中的机器人
 */

public class P1041 {
    // code beginning
    class Solution {
        public boolean isRobotBounded(String instructions) {
            int x = 0, y = 0, direction = 0; // 方向: 0上   1右   2下   3左
            for (char c : instructions.toCharArray()) {
                if (c == 'L') {
                    direction = (direction + 4 - 1) % 4;
                } else if (c == 'R') {
                    direction = (direction + 1) % 4;
                } else if (c == 'G') {
                    switch (direction) {
                        case 0 -> y++;
                        case 1 -> x++;
                        case 2 -> y--;
                        case 3 -> x--;
                    }
                }
            }
            // 情况1: 走完一轮回到原点
            if (x == 0 && y == 0)
                return true;
            // 情况2: 走完一轮,只要方向改变了(即不是直走了),最后不管走多少轮总会回到起点
            return direction != 0;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1041().new Solution();
        Object ans = s.isRobotBounded("GGLLGG");
        System.out.println(ans);
    }
}