package com.kiguri.atcoder.ABC156.B_Digits;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc156/tasks/abc156_b
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int cnt = 0;
        while (N != 0) {
            N = N / K;
            cnt++;
        }
        System.out.println(cnt);
    }
}
