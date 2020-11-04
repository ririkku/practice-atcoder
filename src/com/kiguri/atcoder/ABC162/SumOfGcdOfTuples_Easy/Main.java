package com.kiguri.atcoder.ABC162.SumOfGcdOfTuples_Easy;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc162/tasks/abc162_c
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();

        long ans = 0;
        for (int i = 1; i <= K; i++) {
            for (int j = 1; j <= K; j++) {
                for (int k = 1; k <= K; k++) {
                    ans += BigInteger.valueOf(i).gcd(BigInteger.valueOf(j)).gcd(BigInteger.valueOf(k)).longValue();
                }
            }
        }
        System.out.println(ans);
    }
}
