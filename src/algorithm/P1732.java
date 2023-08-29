package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-03 16:35
 * LastEditTime: 2022-07-03 16:35
 * Description: 1732. 找到最高海拔
 */

public class P1732 {
    // code beginning
    class Solution {
        public int largestAltitude(int[] gain) {
            int altitude = 0, largest = 0;
            for (int h : gain) {
                altitude += h;
                largest = Math.max(largest, altitude);
            }
            return largest;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1732().new Solution();
        Object ans = s.largestAltitude(new int[]{-4, -3, -2, -1, 4, 3, 2});
        System.out.println(ans);
    }
}