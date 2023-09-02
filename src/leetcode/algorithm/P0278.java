package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-09 23:20
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description:
 */

public class P0278 {
    // code beginning
    class Solution {
        /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
        public int firstBadVersion(int n) {
            int left = 1, right = n;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (isBadVersion(mid)) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            return left;
        }

        private boolean isBadVersion(int version) {
            return version == 1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0278().new Solution();
        Object ans = s.firstBadVersion(5);
        System.out.println(ans);
    }
}