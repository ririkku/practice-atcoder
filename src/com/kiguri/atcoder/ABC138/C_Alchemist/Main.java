package com.kiguri.atcoder.ABC138.C_Alchemist;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc138/tasks/abc138_c
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        double[] values = new double[N];
        for (int i = 0; i < N; i++) {
            values[i] = sc.nextDouble();
        }

        Arrays.sort(values);
        double ans = values[0];
        for (int i = 1; i < N; i++) {
            ans = (ans + values[i]) / 2;
        }

        System.out.println(ans);
    }
}
