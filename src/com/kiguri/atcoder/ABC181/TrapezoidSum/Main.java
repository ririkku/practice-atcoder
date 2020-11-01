package com.kiguri.atcoder.ABC181.TrapezoidSum;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc181/tasks/abc181_b
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long res = 0;
        for (int i = 1; i <= N; i++) {
            long A = sc.nextLong();
            long B = sc.nextLong();

            // 総和はシグマ使うっぽい
            // n から 0に向かっての総和
            long right = A * (A - 1) / 2;
            // n から n+xに向かっての総和
            long left = B * (B + 1) / 2;
            res += left - right;
        }
        System.out.println(res);
    }
}
