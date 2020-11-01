package com.kiguri.atcoder.ABC161.PopularVote;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc161/tasks/abc161_b
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int x = 0;
        Integer[] y = new Integer[N];
        for (int i = 0; i < N; i++) {
            int Ai = sc.nextInt();
            x += Ai;
            y[i] = Ai;
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            if (y[i] * (4 * M) >= x) {
                count++;
            }
        }

        if (count < M) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

    }
}
