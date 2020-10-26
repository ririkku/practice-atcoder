package com.kiguri.atcoder.ABC178.ProductMax;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc178/tasks/abc178_b
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        System.out.println(Math.max(Math.max(a * c, a * d), Math.max(b * c, b * d)));
    }
}
