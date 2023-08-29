package algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-05 23:07
 * LastEditTime: 2022-07-05 23:07
 * Description: 729. 我的日程安排表 I
 */

public class P0729 {
    // code beginning
    class MyCalendar {
        List<int[]> booked;

        public MyCalendar() {
            booked = new ArrayList<>();
        }

        public boolean book(int start, int end) {
            for (int[] arr : booked) {
                if (arr[0] < end && start < arr[1]) return false;
            }
            booked.add(new int[]{start, end});
            return true;
        }
    }

    public static void main(String[] args) {
        MyCalendar myCalendar = new P0729().new MyCalendar();
        System.out.println(myCalendar.book(10, 20));
        System.out.println(myCalendar.book(15, 25));
        System.out.println(myCalendar.book(20, 30));

    }
}