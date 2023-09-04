package leetcode.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-03 22:30
 * FileName: src/leetcode/common
 * Description:
 */

public class Utils {
    public static int[] toArray(String s) {
        int n = s.length();
        s = s.substring(1, n - 1).trim();
        List<Integer> list = new ArrayList<>();
        System.out.println(s);
        System.out.println(List.of(Arrays.stream(s.split(",")).toList()));
        for (String el : s.split(",")) {
            System.out.println(el);
            list.add(Integer.parseInt(el));
        }
        int m = list.size();
        int[] nums = new int[m];
        for (int i = 0; i < m; i++) {
            nums[i] = list.get(i);
        }
        return nums;
    }

    public static void main(String[] args) {
        String s = "[1,2,3,4]";
        System.out.println(Arrays.toString(toArray(s)));
    }
}
