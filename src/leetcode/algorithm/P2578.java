package leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-07 23:57
 * FileName: src/leetcode/algorithm
 * Description:2578. 最小和分割
 */

public class P2578 {
    // code beginning
    class Solution {
        public int splitNum(int num) {
            List<Integer> digits = new ArrayList<>();
            while (num > 0) {
                digits.add(num % 10);
                num /= 10;
            }
            digits.sort(Integer::compareTo);
            int num1 = 0, num2 = 0;
            for (int i = 0, n = digits.size(); i < n; i += 2) {
                num1 = num1 * 10 + digits.get(i);
                if (i + 1 < n) {
                    num2 = num2 * 10 + digits.get(i + 1);
                }
            }
            return num1 + num2;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2578().new Solution();
        var ans = s.splitNum(4325);
        System.out.println(ans);
    }
}
