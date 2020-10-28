package com.kiguri.atcoder.ABC177.DontBeLate;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc177/tasks/abc177_a
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int T = sc.nextInt();
        int S = sc.nextInt();

        if (T * S < D) {
            System.out.println("No");
            return;
        }

        System.out.println("Yes");
    }
}
