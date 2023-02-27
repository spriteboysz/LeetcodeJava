package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2023-02-26 22:04
 * FileName: src/leetcode/editor/cn/algorithm
 * Description:
 */

public class P2409 {
    // code beginning
    class Solution {
        private static final int[] MONTH = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
            int arrive = Math.max(process(arriveAlice), process(arriveBob));
            int leave = Math.min(process(leaveAlice), process(leaveBob));
            return Math.max(0, leave - arrive + 1);
        }

        private int process(String date) {
            int mm = Integer.parseInt(date.substring(0, 2));
            int dd = Integer.parseInt(date.substring(3));
            for (int i = 0; i < mm - 1; i++) {
                dd += MONTH[i];
            }
            return dd;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2409().new Solution();
        Object ans = s.countDaysTogether("08-15", "08-18", "08-16", "08-19");
        System.out.println(ans);
    }
}
