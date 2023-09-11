package leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-04 23:18
 * LastEditTime: 2022-07-04 23:18
 * Description: 1656. 设计有序流
 */

public class P1656 {
    // code beginning
    class OrderedStream {
        private int index = 1;
        private final String[] stream;

        public OrderedStream(int n) {
            stream = new String[n + 1];
        }

        public List<String> insert(int idKey, String value) {
            stream[idKey] = value;
            List<String> list = new ArrayList<>();
            while (index < stream.length && stream[index] != null) {
                list.add(stream[index++]);
            }
            return list;
        }
    }

    public static void main(String[] args) {
        OrderedStream os = new P1656().new OrderedStream(5);
        System.out.println(os.insert(3, "ccccc")); // 插入 (3, "ccccc")，返回 []
        System.out.println(os.insert(1, "aaaaa")); // 插入 (1, "aaaaa")，返回 ["aaaaa"]
        System.out.println(os.insert(2, "bbbbb")); // 插入 (2, "bbbbb")，返回 ["bbbbb", "ccccc"]
        System.out.println(os.insert(5, "eeeee")); // 插入 (5, "eeeee")，返回 []
        System.out.println(os.insert(4, "ddddd")); // 插入 (4, "ddddd")，返回 ["ddddd", "eeeee"]

    }
}