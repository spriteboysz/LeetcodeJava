package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-17 11:09
 * LastEditTime: 2022-07-17 11:09
 * Description: 1476. 子矩形查询
 */

public class P1476 {
    // code beginning
    class SubrectangleQueries {
        private final int[][] rectangle;

        public SubrectangleQueries(int[][] rectangle) {
            this.rectangle = rectangle;
        }

        public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
            for (int i = row1; i <= row2; i++) {
                for (int j = col1; j <= col2; j++) {
                    rectangle[i][j] = newValue;
                }
            }
        }

        public int getValue(int row, int col) {
            return rectangle[row][col];
        }
    }

    public static void main(String[] args) {
        SubrectangleQueries subrectangleQueries = new P1476().new SubrectangleQueries(new int[][]{{1, 1, 1}, {2, 2, 2}, {3, 3, 3}});
        System.out.println(subrectangleQueries.getValue(0, 0)); // 返回 1
        subrectangleQueries.updateSubrectangle(0, 0, 2, 2, 100);
        System.out.println(subrectangleQueries.getValue(0, 0)); // 返回 100
        System.out.println(subrectangleQueries.getValue(2, 2)); // 返回 100
        subrectangleQueries.updateSubrectangle(1, 1, 2, 2, 20);
        System.out.println(subrectangleQueries.getValue(2, 2)); // 返回 20
    }
}