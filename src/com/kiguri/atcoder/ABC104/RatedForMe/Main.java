package com.kiguri.atcoder.ABC104.RatedForMe;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc104/tasks/abc104_a
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();

        if (R < 1200) {
            System.out.println("ABC");
        } else if (R < 2800) {
            System.out.println("ARC");
        } else {
            System.out.println("AGC");
        }
    }
}
