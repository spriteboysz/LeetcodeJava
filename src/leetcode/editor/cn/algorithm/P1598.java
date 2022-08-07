package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-07 14:53
 * Description: 1598. 文件夹操作日志搜集器
 */

public class P1598 {
    // code beginning
    class Solution {
        public int minOperations(String[] logs) {
            int depth = 0;
            for (String log : logs) {
                if (log.equals("../")) {
                    depth = Math.max(0, depth - 1);
                } else if (!log.equals("./")) {
                    depth++;
                }
            }
            return depth;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1598().new Solution();
        Object ans = s.minOperations(new String[]{"d1/", "d2/", "./", "d3/", "../", "d31/"});
        System.out.println(ans);
    }
}