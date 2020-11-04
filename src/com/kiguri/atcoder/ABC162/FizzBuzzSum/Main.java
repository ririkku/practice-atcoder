package com.kiguri.atcoder.ABC162.FizzBuzzSum;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc162/tasks/abc162_b
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long ans = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                continue;
            }
            ans += i;
        }

        System.out.println(ans);
    }
}
