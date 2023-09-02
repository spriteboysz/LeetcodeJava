package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-01 20:57
 * FileName: src/leetcode.common
 * Description:2748. 美丽下标对的数目
 */

public class P2748 {
    // code beginning
    class Solution {

        private int gcd(int a, int b) {
            while (a != 0) {
                int tmp = a;
                a = b % a;
                b = tmp;
            }
            return b;
        }

        public int countBeautifulPairs(int[] nums) {
            int ans = 0;
            var cnt = new int[10];
            for (int x : nums) {
                for (int y = 1; y < 10; y++) {
                    if (cnt[y] > 0 && gcd(x % 10, y) == 1) {
                        ans += cnt[y];
                    }
                }
                while (x >= 10) x /= 10;
                cnt[x]++;
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2748().new Solution();
        Object ans = s.countBeautifulPairs(new int[]{2, 5, 1, 4});
        System.out.println(ans);
    }
}
