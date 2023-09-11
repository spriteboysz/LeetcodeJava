package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-08-28 11:19
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 2069. 模拟行走机器人 II
 */

public class P2069 {
    // code beginning
    class Robot {

        public Robot(int width, int height) {

        }

        public void step(int num) {

        }

        public int[] getPos() {
            return new int[]{};
        }

        public String getDir() {
            return "";
        }
    }

    public static void main(String[] args) {
        Robot robot = new P2069().new Robot(6, 3); // 初始化网格图，机器人在 (0, 0) ，朝东。
        robot.step(2);  // 机器人朝东移动 2 步，到达 (2, 0) ，并朝东。
        robot.step(2);  // 机器人朝东移动 2 步，到达 (4, 0) ，并朝东。
        System.out.println(Arrays.toString(robot.getPos())); // 返回 [4, 0]
        System.out.println(robot.getDir()); // 返回 "East"
        robot.step(2);  // 朝东移动 1 步到达 (5, 0) ，并朝东。
        robot.step(1);  // 朝北移动 1 步到达 (5, 2) ，并朝 北 （不是朝西）。
        robot.step(4);  // 下一步继续往北移动将出界，所以逆时针转变方向朝西。
        System.out.println(Arrays.toString(robot.getPos())); // 返回 [1, 2]
        System.out.println(robot.getDir()); // 返回 "West"
    }
}