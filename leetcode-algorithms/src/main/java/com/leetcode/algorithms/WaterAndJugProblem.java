package com.leetcode.algorithms;

/**
 * https://leetcode.com/problems/water-and-jug-problem/
 */
public class WaterAndJugProblem {
    public boolean canMeasureWater(int x, int y, int z) {
        if (x + y < z) {
            return false;
        }

        if (x == z || y == z || x + y == z) {
            return true;
        }

        return z % gcd(x, y) == 0;
    }

    public int gcd(int a, int b){
        while(b != 0 ){
            int tmp = b;
            b = a%b;
            a = tmp;
        }
        return a;
    }
}