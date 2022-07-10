package leetcode.editor.cn.algorithm;

import java.util.HashMap;

/**
 * Author: Deean
 * Date: 2022-07-10 22:23
 * LastEditTime: 2022-07-10 22:23
 * Description: 706. 设计哈希映射
 */

public class P0706 {
    // code beginning
    class MyHashMap {
        HashMap<Integer, Integer> hashMap;

        public MyHashMap() {
            hashMap = new HashMap<>();
        }

        public void put(int key, int value) {
            hashMap.put(key, value);
        }

        public int get(int key) {
            return hashMap.getOrDefault(key, -1);
        }

        public void remove(int key) {
            hashMap.remove(key);
        }
    }

    public static void main(String[] args) {
        MyHashMap myHashMap = new P0706().new MyHashMap();
        myHashMap.put(1, 1); // myHashMap 现在为 [[1,1]]
        myHashMap.put(2, 2); // myHashMap 现在为 [[1,1], [2,2]]
        System.out.println(myHashMap.get(1));    // 返回 1 ，myHashMap 现在为 [[1,1], [2,2]]
        System.out.println(myHashMap.get(3));    // 返回 -1（未找到），myHashMap 现在为 [[1,1], [2,2]]
        myHashMap.put(2, 1); // myHashMap 现在为 [[1,1], [2,1]]（更新已有的值）
        System.out.println(myHashMap.get(2));    // 返回 1 ，myHashMap 现在为 [[1,1], [2,1]]
        myHashMap.remove(2); // 删除键为 2 的数据，myHashMap 现在为 [[1,1]]
        System.out.println(myHashMap.get(2));    // 返回 -1（未找到），myHashMap 现在为 [[1,1]]
    }
}