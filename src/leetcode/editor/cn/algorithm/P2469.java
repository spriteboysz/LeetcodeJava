package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2023-02-26 16:07
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 2469. 温度转换
 */

public class P2469 {
    // code beginning
    class Solution {
        public double[] convertTemperature(double celsius) {
            return new double[]{celsius + 273.15, celsius * 1.8 + 32};
        }
    }

    public static void main(String[] args) {
        Solution s = new P2469().new Solution();
        Object ans = s.convertTemperature(36.50);
        System.out.println(ans);
    }
}
