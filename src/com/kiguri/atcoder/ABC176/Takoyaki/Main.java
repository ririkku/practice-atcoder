package com.kiguri.atcoder.ABC176.Takoyaki;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc176/tasks/abc176_a
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int T = sc.nextInt();

        if (N % X == 0) {
            System.out.println((N / X) * T);
        } else {
            System.out.println((N / X) * T + T);
        }
    }
}
