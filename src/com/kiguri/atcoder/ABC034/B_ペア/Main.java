package com.kiguri.atcoder.ABC034.B_ペア;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc034/tasks/abc034_b
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        if (n % 2 == 0) {
            System.out.println(n - 1);
        } else {
            System.out.println(n + 1);
        }
    }
}
