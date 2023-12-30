package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-12-30 19:20
 * FileName: src/main/java/leetcode/algorithm
 * Description: 2960. 统计已测试设备
 */

public class P2960 {
    // code beginning
    class Solution {
        public int countTestedDevices(int[] batteryPercentages) {
            int cnt = 0;
            for (int i = 0, n = batteryPercentages.length; i < n; i++) {
                if (batteryPercentages[i] > 0) {
                    cnt++;
                    for (int j = i + 1; j < n; j++) {
                        batteryPercentages[j] -= 1;
                    }
                }
            }
            return cnt;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2960().new Solution();
        var ans = s.countTestedDevices(new int[]{1, 1, 2, 1, 3});
        System.out.println(ans);
    }
}
