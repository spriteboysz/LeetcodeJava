package leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-08-27 21:57
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 869. 重新排序得到 2 的幂
 */

public class P0869 {
    // code beginning
    class Solution {
        public boolean reorderedPowerOf2(int n) {
            List<String> list = new ArrayList<>();
            for (int i = 0; Math.pow(2, i) < 10e9; i++) {
                char[] chars = String.valueOf((int) Math.pow(2, i)).toCharArray();
                Arrays.sort(chars);
                list.add(new String(chars));
            }
            // System.out.println(list);
            char[] target = String.valueOf(n).toCharArray();
            Arrays.sort(target);
            return list.contains(new String(target));
        }
    }

    public static void main(String[] args) {
        Solution s = new P0869().new Solution();
        Object ans = s.reorderedPowerOf2(1042);
        System.out.println(ans);
    }
}