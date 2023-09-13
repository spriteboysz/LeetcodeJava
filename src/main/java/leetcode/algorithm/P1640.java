package leetcode.algorithm;

import java.util.*;

import static leetcode.common.Utils.to2DArray;
import static leetcode.common.Utils.toArray;

/**
 * Author: Deean
 * Date: 2023-09-12 23:13
 * FileName: src/main/java/leetcode/algorithm
 * Description:1640. 能否连接形成数组
 */

public class P1640 {
    // code beginning
    class Solution {
        public boolean canFormArray(int[] arr, int[][] pieces) {
            Map<Integer, Integer> index = new HashMap<>();
            for (int i = 0; i < pieces.length; i++) {
                index.put(pieces[i][0], i);
            }
            for (int i = 0; i < arr.length;) {
                if (!index.containsKey(arr[i])) {
                    return false;
                }
                int j = index.get(arr[i]), m = pieces[j].length;
                for (int k = 0; k < m; k++) {
                    if (arr[i + k] != pieces[j][k]) {
                        return false;
                    }
                }
                i = i + m;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1640().new Solution();
        var ans = s.canFormArray(toArray("[91,4,64,78]"), to2DArray("[[78],[4,64],[91]]"));
        System.out.println(ans);
    }
}
