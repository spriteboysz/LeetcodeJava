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
    public static List<Integer> toList(String s) {
        List<Integer> list = new ArrayList<>();
        for (String el : s.substring(1, s.length() - 1).split(",")) {
            list.add(Integer.parseInt(el.trim()));
        }
        return list;
    }

    public static int[] toArray(String s) {
        List<Integer> list = toList(s);
        int[] nums = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return nums;
    }

    public static List<List<Integer>> to2DList(String ss) {
        List<List<Integer>> ll = new ArrayList<>();
        ss = ss.replaceAll("\\s+", "").replace("],[", "]@[");
        for (String el : ss.substring(1, ss.length() - 1).split("@")) {
            ll.add(toList(el.trim()));
        }
        return ll;
    }

    public static int[][] to2DArray(String ss) {
        List<List<Integer>> ll = to2DList(ss);
        int m = ll.size(), n = ll.get(0).size();
        int[][] grid = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = ll.get(i).get(j);
            }
        }
        return grid;
    }

    public static List<String> toSList(String s) {
        return new ArrayList<>(Arrays.asList(s.substring(1, s.length() - 1).split(",")));
    }

    public static String[] toSArray(String s) {
        List<String> list = toSList(s);
        String[] strs = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strs[i] = list.get(i);
        }
        return strs;
    }

    public static void main(String[] args) {
        String s = "[1,2,3,4]";
        System.out.println(toList(s));
        System.out.println(Arrays.toString(toArray(s)));

        String ss = "[[1,2,3],[4,5,6], [7,8, 9]]";
        System.out.println(to2DList(ss));
        System.out.println(Arrays.deepToString(to2DArray(ss)));
        String words = "[\"this\",\"is\",\"only\",\"test\"]";
        System.out.println(toSList(words));
        System.out.println(Arrays.toString(toSArray(words)));
    }
}
