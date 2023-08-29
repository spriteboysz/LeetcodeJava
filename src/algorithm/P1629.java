package algorithm;

/**
 * Author: Deean
 * Date: 2022-08-07 15:01
 * Description: 1629. 按键持续时间最长的键
 */

public class P1629 {
    // code beginning
    class Solution {
        public char slowestKey(int[] releaseTimes, String keysPressed) {
            char slowest = keysPressed.charAt(0);
            int max = releaseTimes[0];
            for (int i = 1; i < keysPressed.length(); i++) {
                char key = keysPressed.charAt(i);
                int time = releaseTimes[i] - releaseTimes[i - 1];
                if (time > max || (time == max && key > slowest)) {
                    slowest = key;
                    max = time;
                }
            }
            return slowest;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1629().new Solution();
        Object ans = s.slowestKey(new int[]{16, 23, 36, 46, 62}, "spuda");
        System.out.println(ans);
    }
}