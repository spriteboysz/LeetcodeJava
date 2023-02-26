package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2023-02-26 17:00
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 2437. 有效时间的数目
 */

public class P2437 {
    // code beginning
    class Solution {
        public int countTime(String time) {
            int cnt = 0;
            for (int i = 0; i < 24 * 60; i++) {
                int hh = i / 60, mm = i % 60;
                String cur = "%02d:%02d".formatted(hh, mm);
                boolean flag = true;
                for (int j = 0; j < 5; j++) {
                    if (time.charAt(j) != '?' && cur.charAt(j) != time.charAt(j)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) cnt += 1;
            }
            return cnt;
        }

    }

    public static void main(String[] args) {
        Solution s = new P2437().new Solution();
        Object ans = s.countTime("0?:0?");
        System.out.println(ans);
    }
}
