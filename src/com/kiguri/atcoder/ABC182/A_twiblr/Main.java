package com.kiguri.atcoder.ABC182.A_twiblr;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc182/tasks/abc182_a
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(((2 * A) + 100) - B);
    }
}
