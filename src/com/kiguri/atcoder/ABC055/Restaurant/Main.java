package com.kiguri.atcoder.ABC055.Restaurant;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc055/tasks/abc055_a
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println((N * 800) - (N / 15 * 200));
    }
}
