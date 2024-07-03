package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2024-06-28 22:29
 * FileName: src/main/java/leetcode/algorithm
 * Description: 3184. 构成整天的下标对数目 I
 */

public class P3184 {
    // code beginning
    class Solution {
        public int countCompleteDayPairs(int[] hours) {
            int cnt = 0;
            for (int i = 0; i < hours.length; i++) {
                for (int j = i + 1; j < hours.length; j++) {
                    if ((hours[i] + hours[j]) % 24 == 0) {
                        cnt++;
                    }
                }
            }
            return cnt;
        }
    }

    public static void main(String[] args) {
        Solution s = new P3184().new Solution();
        var ans = s.countCompleteDayPairs(new int[]{72, 48, 24, 3});
        System.out.println(ans);
    }
}
