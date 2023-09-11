package leetcode.sword;

/**
 * Author: Deean
 * Date: 2022-08-07 23:40
 * Description: 剑指 Offer II 073. 狒狒吃香蕉
 */

public class OII0073 {
    // code beginning
    class Solution {
        public int minEatingSpeed(int[] piles, int h) {
            int left = 1, right = 0;
            for (int pile : piles) right = Math.max(right, pile);
            while (left < right) {
                int mid = (right - left) / 2 + left;
                long time = getTime(piles, mid);
                if (time <= h) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            return left;
        }

        public long getTime(int[] piles, int speed) {
            long time = 0;
            for (int pile : piles) {
                time += (pile + speed - 1) / speed;
            }
            return time;
        }
    }

    public static void main(String[] args) {
        Solution s = new OII0073().new Solution();
        Object ans = s.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 5);
        System.out.println(ans);
        ans = s.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 6);
        System.out.println(ans);
    }
}