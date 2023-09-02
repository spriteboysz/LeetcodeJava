package leetcode.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2022-08-04 23:30
 * Description: 575. 分糖果
 */

public class P0575 {
    // code beginning
    class Solution {
        public int distributeCandies(int[] candyType) {
            Set<Integer> set = new HashSet<>();
            for (int type : candyType) {
                set.add(type);
            }
            return Math.min(set.size(), candyType.length / 2);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0575().new Solution();
        Object ans = s.distributeCandies(new int[]{1, 1, 2, 3});
        System.out.println(ans);
    }
}
