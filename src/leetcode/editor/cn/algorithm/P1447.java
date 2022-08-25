package leetcode.editor.cn.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-08-25 22:47
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 1447. 最简分数
 */

public class P1447 {
    // code beginning
    class Solution {
        public List<String> simplifiedFractions(int n) {
            List<String> fractions = new ArrayList<>();
            for (int denominator = 2; denominator <= n; denominator++) {
                for (int numerator = 1; numerator < denominator; numerator++) {
                    if (gcd(denominator, numerator) == 1) {
                        fractions.add(numerator + "/" + denominator);
                    }
                }
            }
            return fractions;
        }

        private int gcd(int a, int b) {
            return b != 0 ? gcd(b, a % b) : a;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1447().new Solution();
        Object ans = s.simplifiedFractions(4);
        System.out.println(ans);
    }
}