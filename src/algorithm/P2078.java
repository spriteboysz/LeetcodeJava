package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-10 15:58
 * LastEditTime: 2022-07-10 15:58
 * Description: 2078. 两栋颜色不同且距离最远的房子
 */

public class P2078 {
    // code beginning
    class Solution {
        public int maxDistance(int[] colors) {
            int n = colors.length;
            if (colors[0] != colors[n - 1]) return n - 1;
            int left = 1, right = n - 2;
            while (colors[left] == colors[0]) left++;
            while (colors[right] == colors[n - 1]) right--;
            return Math.max(right, n - 1 - left);
        }
    }

    public static void main(String[] args) {
        Solution s = new P2078().new Solution();
        Object ans = s.maxDistance(new int[]{1, 8, 3, 8, 3});
        System.out.println(ans);
    }
}