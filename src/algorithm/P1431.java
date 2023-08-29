package algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-06-30 23:07
 * LastEditTime: 2022-06-30 23:07
 * Description: 1431. 拥有最多糖果的孩子
 */

public class P1431 {
    // code beginning
    class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            int max = 0;
            for (int candy : candies) {
                if (candy > max) max = candy;
            }
            List<Boolean> kids = new ArrayList<>();
            for (int candy : candies) {
                kids.add(candy + extraCandies >= max);
            }
            return kids;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1431().new Solution();
        Object ans = s.kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1);
        System.out.println(ans);
    }
}