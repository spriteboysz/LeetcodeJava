package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-07 20:21
 * Description: 495. 提莫攻击
 */

public class P0495 {
    // code beginning
    class Solution {
        public int findPoisonedDuration(int[] timeSeries, int duration) {
            int time = 0, last = -1;
            for (int s : timeSeries) {
                int e = s + duration - 1;
                time += last < s ? duration : e - last;
                last = e;
            }
            return time;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0495().new Solution();
        Object ans = s.findPoisonedDuration(new int[]{1, 2}, 2);
        System.out.println(ans);
    }
}