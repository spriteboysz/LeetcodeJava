package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-01 21:14
 * LastEditTime: 2022-07-01 21:14
 * Description: .
 */

public class P1603 {
    // code beginning
    class ParkingSystem {
        public int big, medium, small;

        public ParkingSystem(int big, int medium, int small) {
            this.big = big;
            this.medium = medium;
            this.small = small;
        }

        public boolean addCar(int carType) {
            switch (carType) {
                case 1 -> {
                    if (this.big >= 1) {
                        this.big--;
                        return true;
                    } else {
                        return false;
                    }
                }
                case 2 -> {
                    if (this.medium >= 1) {
                        this.medium--;
                        return true;
                    } else {
                        return false;
                    }
                }
                case 3 -> {
                    if (this.small >= 1) {
                        this.small--;
                        return true;
                    } else {
                        return false;
                    }
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        ParkingSystem park = new P1603().new ParkingSystem(1, 1, 0);
        System.out.println(park.addCar(1));
        System.out.println(park.addCar(2));
        System.out.println(park.addCar(3));
        System.out.println(park.addCar(1));
    }
}