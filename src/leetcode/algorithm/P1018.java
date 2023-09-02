package leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-08-11 21:07
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 1018. 可被 5 整除的二进制前缀
 */

public class P1018 {
    // code beginning
    class Solution {
        public List<Boolean> prefixesDivBy5(int[] nums) {
            List<Boolean> list = new ArrayList<>();
            int n = 0;
            for (int num : nums) {
                n = (n * 2 + num) % 5;
                list.add(n == 0);
            }
            return list;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1018().new Solution();
        Object ans = s.prefixesDivBy5(new int[]{0, 1, 1});
        System.out.println(ans);
        ans = s.prefixesDivBy5(new int[]{1, 0, 1});
        System.out.println(ans);
    }
}