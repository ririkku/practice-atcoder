package com.kiguri.atcoder.ABC151.AchieveTheGoal;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc151/tasks/abc151_b
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int M = sc.nextInt();

        int abs = N * M;

        int x = 0;
        for (int i = 0; i < N - 1; i++) {
            x += sc.nextInt();
        }

        // もうクリアしてる
        int i = abs - x;
        if (i <= K && i < 0) {
            System.out.println(0);
            return;
        }

        // 平均点足りない
        if (i <= K) {
            System.out.println(i);
            return;
        }

        System.out.println(-1);
    }
}
