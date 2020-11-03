package com.kiguri.atcoder.ABC178.Ubiquity;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc178/tasks/abc178_c
 */
public class Main {

    private static final long MOD = 1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long A = pow(10, N);
        long B = pow(9, N);
        long C = pow(8, N);
        long res = A - 2 * B + C;
        System.out.println((res % MOD + MOD) % MOD);
    }

    private static long pow(int x, int N) {
        long d = 1;
        for (int i = 0; i < N; i++) {
            d = d * x % 1000000007;
        }
        return d;
    }
}
