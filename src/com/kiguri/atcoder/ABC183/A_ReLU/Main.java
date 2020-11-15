package com.kiguri.atcoder.ABC183.A_ReLU;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc183/tasks/abc183_a
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x >= 0) {
            System.out.println(x);
        }
        if(x < 0) {
            System.out.println(0);
        }
    }
}
