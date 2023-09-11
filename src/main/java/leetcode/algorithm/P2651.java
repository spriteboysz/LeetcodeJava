package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-03 22:10
 * FileName: src/leetcode/algorithm
 * Description:2651. 计算列车到站时间
 */

public class P2651 {
    // code beginning
    class Solution {
        public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
            return (arrivalTime + delayedTime) % 24;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2651().new Solution();
        Object ans = s.findDelayedArrivalTime(15, 5);
        System.out.println(ans);
    }
}
