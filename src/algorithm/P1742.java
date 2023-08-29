package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-10 16:40
 * LastEditTime: 2022-07-10 16:40
 * Description: 1742. 盒子中小球的最大数量
 */

public class P1742 {
    // code beginning
    class Solution {
        public int countBalls(int lowLimit, int highLimit) {
            int[] boxes = new int[46];
            for (int i = lowLimit; i <= highLimit; i++) {
                String str = String.valueOf(i);
                int count = 0;
                for (char c : str.toCharArray()) {
                    count += c - '0';
                }
                boxes[count]++;
            }

            int max = 0;
            for (int box : boxes) {
                max = Math.max(max, box);
            }
            return max;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1742().new Solution();
        Object ans = s.countBalls(5, 15);
        System.out.println(ans);
        ans = s.countBalls(19, 28);
        System.out.println(ans);
    }
}