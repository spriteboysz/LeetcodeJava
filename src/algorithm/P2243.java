package algorithm;

/**
 * Author: Deean
 * Date: 2022-08-06 07:55
 * Description: 2243. 计算字符串的数字和
 */

public class P2243 {
    // code beginning
    class Solution {
        public String digitSum(String s, int k) {
            if (s.length() <= k) return s;
            StringBuilder builder = new StringBuilder();
            int len = s.length();
            for (int i = 0; i < len; i += k) {
                int sum = 0;
                for (int j = 0; j < k && i + j < len; j++) {
                    sum += s.charAt(i + j) - '0';
                }
                builder.append(sum);
            }
            return digitSum(builder.toString(), k);
        }
    }

    public static void main(String[] args) {
        Solution s = new P2243().new Solution();
        Object ans = s.digitSum("11111222223", 3);
        System.out.println(ans);
    }
}