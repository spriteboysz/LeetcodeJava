package algorithm;

/**
 * Author: Deean
 * Date: 2022-06-30 23:29
 * LastEditTime: 2022-06-30 23:29
 * Description: 1281. 整数的各位积和之差
 */

public class P1281 {
    // code beginning
    class Solution {
        public int subtractProductAndSum(int n) {
            int sum = 0, product = 1;
            String str = String.valueOf(n);
            for (int i = 0; i < str.length(); i++) {
                int number = Integer.parseInt(String.valueOf(str.charAt(i)));
                sum += number;
                product *= number;
            }
            return product - sum;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1281().new Solution();
        Object ans = s.subtractProductAndSum(4421);
        System.out.println(ans);
    }
}