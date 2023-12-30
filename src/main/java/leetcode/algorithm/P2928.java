package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-12-30 20:28
 * FileName: src/main/java/leetcode/algorithm
 * Description: 2928. 给小朋友们分糖果 I
 */

public class P2928 {
    // code beginning
    class Solution {
        public int distributeCandies(int n, int limit) {
            int cnt = 0;
            for (int i = 0; i <= limit; i++) {
                for (int j = 0; j <= limit; j++) {
                    if (i + j > n) break;
                    for (int k = 0; k <= limit; k++) {
                        if (i + j + k == n) {
                            cnt++;
                        }
                    }
                }
            }
            return cnt;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2928().new Solution();
        var ans = s.distributeCandies(3, 3);
        System.out.println(ans);
        System.out.println(s.distributeCandies(5, 2));
    }
}
