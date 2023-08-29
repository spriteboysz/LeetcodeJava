package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-20 22:43
 * LastEditTime: 2022-07-20 22:43
 * Description: 458. 可怜的小猪
 */

public class P0458 {
    // code beginning
    class Solution {
        public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
            int states = minutesToTest / minutesToDie + 1;
            return (int) Math.ceil(Math.log(buckets) / Math.log(states));
        }
    }

    public static void main(String[] args) {
        Solution s = new P0458().new Solution();
        Object ans = s.poorPigs(4, 15, 15);
        System.out.println(ans);
    }
}