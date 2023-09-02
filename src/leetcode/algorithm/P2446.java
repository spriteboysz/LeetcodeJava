package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-02-26 16:46
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 2446. 判断两个事件是否存在冲突
 */

public class P2446 {
    // code beginning
    class Solution {
        public boolean haveConflict(String[] event1, String[] event2) {
            return event1[0].compareTo(event2[1]) <= 0 && event1[1].compareTo(event2[0]) >= 0;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2446().new Solution();
        Object ans = s.haveConflict(new String[]{"01:15", "02:00"}, new String[]{"02:00", "03:00"});
        System.out.println(ans);
    }
}
