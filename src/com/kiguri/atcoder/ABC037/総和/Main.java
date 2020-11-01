package com.kiguri.atcoder.ABC037.総和;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc037/tasks/abc037_c
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 配列の長さ
        int N = sc.nextInt();

        // 始まり？
        int K = sc.nextInt();

        long[] a = new long[N];

        // aの累積和を格納するため、+1してるのは、0番目には0がある
        long[] b = new long[N + 1];

        // Nの長さ分を一旦格納
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextLong();
        }

        // 累積和を計算する
        // int i = 1なのは、b[0] = 0は決まっているから
        for (int i = 1; i <= N; i++) {
            b[i] = b[i - 1] + a[i - 1];
        }

        // スタート地点はKから
        long res = 0;
        for (int i = 0; i < N - K + 1; i++) {
            // スタート地点から、スタートより前の累積和をひく
            res += b[i + K] - b[i];
        }

        System.out.println(res);
    }
}
