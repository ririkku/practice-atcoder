package com.kiguri.atcoder.A_Kikus_library;

public class Main {

    /**
     * Math.powがdoubleを返すので、longで返す用のやつ
     */
    private static long pow(int x, int N) {
        long d = 1;
        for (int i = 0; i < N; i++) {
            d = d * x % 1000000007;
        }
        return d;
    }
}
