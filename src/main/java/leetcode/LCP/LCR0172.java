package leetcode.LCP;

/**
 * Author: Deean
 * Date: 2023-10-01 17:45
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 172. 统计目标成绩的出现次数
 */

public class LCR0172 {
    // code beginning
    class Solution {
        public int countTarget(int[] scores, int target) {
            int cnt = 0;
            for (int score : scores) {
                if (score == target) {
                    cnt++;
                }
            }
            return cnt;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0172().new Solution();
        var ans = s.countTarget(new int[]{2, 2, 3, 4, 4, 4, 5, 6, 6, 8}, 4);
        System.out.println(ans);
    }
}
