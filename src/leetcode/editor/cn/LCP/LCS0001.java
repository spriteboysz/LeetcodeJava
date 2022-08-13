package leetcode.editor.cn.LCP;

/**
 * Author: Deean
 * Date: 2022-08-13 20:57
 * FileName: src/leetcode/editor/cn/LCP
 * Description: LCS 01. 下载插件
 */

public class LCS0001 {
    // code beginning
    class Solution {
        public int leastMinutes(int n) {
            int count = 0, speed = 1;
            while (speed < n) {
                speed *= 2;
                count++;
            }
            return count + 1;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCS0001().new Solution();
        Object ans = s.leastMinutes(4);
        System.out.println(ans);
    }
}