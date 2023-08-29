package algorithm;

/**
 * Author: Deean
 * Date: 2022-08-29 23:13
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 165. 比较版本号
 */

public class P0165 {
    // code beginning
    class Solution {
        public int compareVersion(String version1, String version2) {
            String[] v1 = version1.split("\\."), v2 = version2.split("\\.");
            for (int i = 0; i < v1.length || i < v2.length; i++) {
                int x = 0, y = 0;
                if (i < v1.length) x = Integer.parseInt(v1[i]);
                if (i < v2.length) y = Integer.parseInt(v2[i]);
                if (x > y) return 1;
                if (x < y) return -1;
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0165().new Solution();
        Object ans = s.compareVersion("1.0", "1.0.0");
        System.out.println(ans);
    }
}