package com.kiguri.atcoder.ABC181.HeavyRotation;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc181/tasks/abc181_a
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N % 2 == 0) {
            System.out.println("White");
        } else {
            System.out.println("Black");
        }
    }
}
