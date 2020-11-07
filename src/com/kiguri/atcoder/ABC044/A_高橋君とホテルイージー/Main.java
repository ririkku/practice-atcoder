package com.kiguri.atcoder.ABC044.A_高橋君とホテルイージー;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc044/tasks/abc044_a
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int ans = 0;
        for (int i = 1; i <= N; i++) {
            if (i <= K) {
                ans += X;
                continue;
            }
            ans += Y;
        }

        System.out.println(ans);
    }
}
