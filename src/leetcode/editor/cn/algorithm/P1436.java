package leetcode.editor.cn.algorithm;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2022-06-30 23:59
 * LastEditTime: 2022-06-30 23:59
 * Description: 1436. 旅行终点站
 */

public class P1436 {
    // code beginning
    class Solution {
        public String destCity(List<List<String>> paths) {
            Set<String> source = new HashSet<>();
            for (List<String> path : paths) {
                source.add(path.get(0));
            }
            for (List<String> path : paths) {
                if (!source.contains(path.get(1))) {
                    return path.get(1);
                }
            }
            return "";
        }
    }

    public static void main(String[] args) {
        Solution s = new P1436().new Solution();
        //List<List<String>> paths = new ArrayList<>();
        //paths.add(new ArrayList<List>("London", "New York"));
        //Object ans = s.destCity(paths);
        //System.out.println(ans);
    }
}