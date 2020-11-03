package com.kiguri.atcoder.ABC179.AxBplusC;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc179/tasks/abc179_c
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        long res = 0;
        for (long A = 1; A <= N; A++) {
            res += (N - 1) / A;
        }

        System.out.println(res);
    }
}
