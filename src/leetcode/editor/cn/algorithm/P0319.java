package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-20 21:34
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 319. 灯泡开关
 */

public class P0319 {
    // code beginning
    class Solution {
        public int bulbSwitch(int n) {
            return (int) Math.sqrt(n + 0.5);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0319().new Solution();
        Object ans = s.bulbSwitch(3);
        System.out.println(ans);
        ans = s.bulbSwitch(0);
        System.out.println(ans);
        ans = s.bulbSwitch(1);
        System.out.println(ans);
    }
}