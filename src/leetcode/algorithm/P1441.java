package leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-08-11 23:25
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 1441. 用栈操作构建数组
 */

public class P1441 {
    // code beginning
    class Solution {
        public List<String> buildArray(int[] target, int n) {
            List<String> operator = new ArrayList<>();
            for (int i = 1, j = 0; i <= n && j < target.length; i++) {
                operator.add("Push");
                if (i == target[j]) {
                    j++;
                } else {
                    operator.add("Pop");
                }
            }
            return operator;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1441().new Solution();
        Object ans = s.buildArray(new int[]{1, 3}, 3);
        System.out.println(ans);
        ans = s.buildArray(new int[]{1, 2}, 4);
        System.out.println(ans);
    }
}