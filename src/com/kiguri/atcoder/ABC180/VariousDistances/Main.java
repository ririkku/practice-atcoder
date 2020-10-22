package com.kiguri.atcoder.ABC180.VariousDistances;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc180/tasks/abc180_b
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long a = 0;
        long b = 0;
        long c = 0;
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            a += Math.abs(value);
            b += (long)value * (long)value;
            c = Math.max(c, Math.abs(value));
        }

        System.out.println(a);
        System.out.println(Math.sqrt(b));
        System.out.println(c);

        scanner.close();
    }
}
