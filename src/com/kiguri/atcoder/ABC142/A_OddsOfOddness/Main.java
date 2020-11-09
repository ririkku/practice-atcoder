package com.kiguri.atcoder.ABC142.A_OddsOfOddness;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc142/tasks/abc142_a
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble();
        System.out.println(Math.round(N / 2) / N);
    }
}
