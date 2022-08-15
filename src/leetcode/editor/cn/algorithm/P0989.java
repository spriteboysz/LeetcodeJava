package leetcode.editor.cn.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-08-15 23:50
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 989. 数组形式的整数加法
 */

public class P0989 {
    // code beginning
    class Solution {
        public List<Integer> addToArrayForm(int[] num, int k) {
            List<Integer> result = new ArrayList<>();
            for (int i = num.length - 1; i >= 0; i--) {
                int cur = num[i] + k % 10;
                k /= 10;
                if (cur >= 10) {
                    k += 1;
                    cur -= 10;
                }
                result.add(cur);
            }
            while (k > 0) {
                result.add(k % 10);
                k /= 10;
            }
            Collections.reverse(result);
            return result;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0989().new Solution();
        Object ans = s.addToArrayForm(new int[]{2, 1, 5}, 806);
        System.out.println(ans);
    }
}