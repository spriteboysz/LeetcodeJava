package algorithm;

import java.util.Arrays;
import java.util.Random;

/**
 * Author: Deean
 * Date: 2022-08-28 21:10
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 478. 在圆内随机生成点
 */

public class P0478 {
    // code beginning
    class Solution {
        double radius;
        double x_center;
        double y_center;
        Random random = new Random();

        public Solution(double radius, double x_center, double y_center) {
            this.radius = radius;
            this.x_center = x_center;
            this.y_center = y_center;
        }

        public double[] randPoint() {
            double u = random.nextDouble();
            double theta = random.nextDouble() * 2 * Math.PI;
            double r = Math.sqrt(u);
            return new double[]{
                    x_center + r * Math.cos(theta) * this.radius,
                    y_center + r * Math.sin(theta) * this.radius};
        }
    }

    public static void main(String[] args) {
        Solution solution = new P0478().new Solution(1.0, 0.0, 0.0);
        System.out.println(Arrays.toString(solution.randPoint()));// 返回[-0.02493，-0.38077]
        System.out.println(Arrays.toString(solution.randPoint()));// 返回[0.82314,0.38945]
        System.out.println(Arrays.toString(solution.randPoint()));// 返回[0.36572,0.17248]
    }
}