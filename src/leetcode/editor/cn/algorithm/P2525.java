package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2023-02-26 11:35
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 2525. 根据规则将箱子分类
 */

public class P2525 {
    // code beginning
    class Solution {
        public String categorizeBox(int length, int width, int height, int mass) {
            boolean bulky = length >= (int) 1e4 || width >= (int) 1e4 || height >= (int) 1e4
                    || ((long) length * width * height) >= (int) 1e9;
            boolean heavy = mass >= 100;

            if (bulky && heavy) return "Both";
            if (bulky) return "Bulky";
            if (heavy) return "Heavy";
            return "Neither";
        }
    }

    public static void main(String[] args) {
        Solution s = new P2525().new Solution();
        Object ans = s.categorizeBox(1000, 35, 700, 300);
        System.out.println(ans);
    }
}
