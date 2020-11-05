package com.kiguri.atcoder.ABC092.MaximumSum;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc096/tasks/abc096_b
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();

        int max = Math.max(Math.max(A, B), C);

        // 一番大きいものを引けば残りが取れる
        int i = A + B + C - max;
        // 一番大きい数に対して
        int j = (int) (max * Math.pow(2, K));
        System.out.println(j + i);
    }
}
