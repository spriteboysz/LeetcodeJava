package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-06-25 23:37
 * LastEditTime: 2022-06-25 23:37
 * Description: .
 */

public class Test01 {

    public static void main(String[] args) {
        int hour = 1, minute = 1;
        int count = 0;
        for (int i = 0; i < 6; i++) {
            count += ((hour >> i) & 1) + ((minute >> i) & 1);
        }
        System.out.println(count);
    }
}