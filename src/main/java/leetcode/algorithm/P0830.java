package leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-15 23:21
 * FileName: src/main/java/leetcode/algorithm
 * Description:830. 较大分组的位置
 */

public class P0830 {
    // code beginning
    class Solution {
        public List<List<Integer>> largeGroupPositions(String s) {
            List<List<Integer>> group = new ArrayList<>();
            for (int i = 0, n = s.length(), num = 1; i < n; i++) {
                if (i == n - 1 || s.charAt(i) != s.charAt(i + 1)) {
                    if (num >= 3) {
                        group.add(Arrays.asList(i - num + 1, i));
                    }
                    num = 1;
                } else {
                    num++;
                }
            }
            return group;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0830().new Solution();
        var ans = s.largeGroupPositions("abcdddeeeeaabbbcd");
        System.out.println(ans);
    }
}
