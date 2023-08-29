package algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-17 13:37
 * LastEditTime: 2022-07-17 13:37
 * Description: 2125. 银行中的激光束数量
 */

public class P2125 {
    // code beginning
    class Solution {
        public int numberOfBeams(String[] bank) {
            int[] beams = new int[bank.length];
            for (int i = 0; i < bank.length; i++) {
                for (char c : bank[i].toCharArray()) {
                    if (c == '1') beams[i]++;
                }
            }
            // System.out.println(Arrays.toString(beams));
            List<Integer> devices = new ArrayList<>();
            int count = 0;
            for (int beam : beams) {
                if (beam != 0) devices.add(beam);
            }
            for (int i = 0; i < devices.size() - 1; i++) {
                count += devices.get(i) * devices.get(i + 1);
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2125().new Solution();
        Object ans = s.numberOfBeams(new String[]{"011001", "000000", "010100", "001000"});
        System.out.println(ans);
    }
}