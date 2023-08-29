package algorithm;

/**
 * Author: Deean
 * Date: 2023-02-26 11:13
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 2544. 交替数字和
 */

public class P2544 {
    // code beginning
    class Solution {
        public int alternateDigitSum(int n) {
            int sum = 0, flag = 1;
            for (String c : String.valueOf(n).split("")) {
                sum += Integer.parseInt(c) * flag;
                flag *= -1;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2544().new Solution();
        Object ans = s.alternateDigitSum(521);
        System.out.println(ans);
    }
}
