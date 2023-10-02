package leetcode.LCP;

/**
 * Author: Deean
 * Date: 2023-10-01 17:47
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 173. 点名
 */

public class LCR0173 {
    // code beginning
    class Solution {
        public int takeAttendance(int[] records) {
            for (int i = 0; i < records.length; i++) {
                if (i != records[i]) {
                    return i;
                }
            }
            return records.length;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0173().new Solution();
        var ans = s.takeAttendance(new int[]{0, 1, 2, 3, 4, 5, 6, 8});
        System.out.println(ans);
    }
}
