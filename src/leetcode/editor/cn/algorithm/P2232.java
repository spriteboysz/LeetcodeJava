package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-27 22:52
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 2232. 向表达式添加括号后的最小结果
 */

public class P2232 {
    // code beginning
    class Solution {
        public String minimizeResult(String expression) {
            String[] nums = expression.split("\\+");
            int ln = nums[0].length(), rn = nums[1].length(), minValue = Integer.MAX_VALUE;
            String ans = "";
            for (int i = 0; i < ln; i++) {
                int li = Integer.parseInt(i == 0 ? "1" : nums[0].substring(0, i));
                int ri = Integer.parseInt(nums[0].substring(i));
                for (int j = 1; j <= rn; j++) {
                    int lj = Integer.parseInt(j == 0 ? "1" : nums[1].substring(0, j));
                    int rj = Integer.parseInt(j == rn ? "1" : nums[1].substring(j));
                    if (li * (ri + lj) * rj < minValue) {
                        minValue = li * (ri + lj) * rj;
                        ans = nums[0].substring(0, i) + "(" + nums[0].substring(i) + "+" + nums[1].substring(0, j) + ")" + nums[1].substring(j);
                    }
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2232().new Solution();
        Object ans = s.minimizeResult("999+999");
        System.out.println(ans);
    }
}