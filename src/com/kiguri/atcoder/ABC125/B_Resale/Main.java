package com.kiguri.atcoder.ABC125.B_Resale;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc125/tasks/abc125_b
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] jewelries = new int[N];
        for (int i = 0; i < N; i++) {
            jewelries[i] = sc.nextInt();
        }
        int[] costs = new int[N];
        for (int i = 0; i < N; i++) {
            costs[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (jewelries[i] >= costs[i]) {
                ans += jewelries[i] - costs[i];
            }
        }

        System.out.println(ans);
    }
}
