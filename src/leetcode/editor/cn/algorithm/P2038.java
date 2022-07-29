package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-29 23:50
 * LastEditTime: 2022-07-29 23:50
 * Description: 2038. 如果相邻两个颜色均相同则删除当前颜色
 */

public class P2038 {
    // code beginning
    class Solution {
        public boolean winnerOfGame(String colors) {
            int a = 0, b = 0;
            for (int i = 1; i < colors.length() - 1; i++) {
                char x = colors.charAt(i - 1), y = colors.charAt(i), z = colors.charAt(i + 1);
                if (x == 'A' && y == 'A' && z == 'A') a++;
                if (x == 'B' && y == 'B' && z == 'B') b++;
            }
            return a > b;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2038().new Solution();
        Object ans = s.winnerOfGame("ABBBBBBBAAA");
        System.out.println(ans);
        ans = s.winnerOfGame("AAABABB");
        System.out.println(ans);
    }
}