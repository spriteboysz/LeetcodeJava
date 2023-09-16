package leetcode.algorithm;

import leetcode.common.Utils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2023-09-16 20:50
 * FileName: src/main/java/leetcode/algorithm
 * Description:2848. 与车相交的点
 */

public class P2848 {
    // code beginning
    class Solution {
        public int numberOfPoints(List<List<Integer>> nums) {
            Set<Integer> seen = new HashSet<>();
            for (List<Integer> arr : nums) {
                for (int num = arr.get(0); num <= arr.get(1); num++) {
                    seen.add(num);
                }
            }
            return seen.size();
        }
    }

    public static void main(String[] args) {
        Solution s = new P2848().new Solution();
        var ans = s.numberOfPoints(Utils.to2DList("[[1,3],[5,8]]"));
        System.out.println(ans);
    }
}
