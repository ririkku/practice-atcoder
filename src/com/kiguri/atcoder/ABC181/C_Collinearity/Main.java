package com.kiguri.atcoder.ABC181.C_Collinearity;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc181/tasks/abc181_c
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {

                    int x1 = x[i] - x[k];
                    int x2 = x[j] - x[k];

                    int y1 = y[i] - y[k];
                    int y2 = y[j] - y[k];

                    if (x1 * y2 == x2 * y1) {
                        System.out.println("Yes");
                        return;
                    }
                }
            }
        }

        System.out.println("No");
    }
}
