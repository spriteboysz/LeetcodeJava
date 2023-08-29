package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-29 21:44
 * LastEditTime: 2022-07-29 21:44
 * Description: 593. 有效的正方形
 */

public class P0593 {
    // code beginning
    class Solution {
        long len = -1;

        public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
            return calc(p1, p2, p3) && calc(p1, p2, p4) && calc(p1, p3, p4) && calc(p2, p3, p4);
        }

        private boolean calc(int[] a, int[] b, int[] c) {
            long l1 = (long) (a[0] - b[0]) * (a[0] - b[0]) + (long) (a[1] - b[1]) * (a[1] - b[1]);
            long l2 = (long) (a[0] - c[0]) * (a[0] - c[0]) + (long) (a[1] - c[1]) * (a[1] - c[1]);
            long l3 = (long) (b[0] - c[0]) * (b[0] - c[0]) + (long) (b[1] - c[1]) * (b[1] - c[1]);
            boolean ok = (l1 == l2 && l1 + l2 == l3) || (l1 == l3 && l1 + l3 == l2) || (l2 == l3 && l2 + l3 == l1);
            if (!ok) return false;
            if (len == -1) {
                len = Math.min(l1, l2);
            } else {
                return len != 0 && len == Math.min(l1, l2);
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0593().new Solution();
        Object ans = s.validSquare(new int[]{1, 0}, new int[]{-1, 0}, new int[]{0, 1}, new int[]{0, -1});
        System.out.println(ans);
    }
}