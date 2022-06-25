package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-06-26 00:00
 * LastEditTime: 2022-06-26 00:00
 * Description: 832. 翻转图像
 */

public class P0832 {
    // code beginning
    class Solution {
        public int[][] flipAndInvertImage(int[][] image) {
            int n = image.length;
            int[][] newImage = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    newImage[i][j] = 1 - image[i][n - 1 - j];
                }
            }
            return newImage;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0832().new Solution();
        Object ans = s.flipAndInvertImage(new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}});
        System.out.println(ans);
    }
}