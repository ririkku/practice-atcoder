package com.kiguri.atcoder.ARC088.C_MultipleGift;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/arc088/tasks/arc088_a
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long Y = sc.nextLong();

        long a = 0;
        for (long i = X; i <= Y; i *= 2) {
            a++;
        }

        System.out.println(a);
    }
}
