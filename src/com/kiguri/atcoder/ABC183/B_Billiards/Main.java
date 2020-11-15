package com.kiguri.atcoder.ABC183.B_Billiards;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc183/tasks/abc183_b
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Sx = sc.nextDouble();
        double Sy = sc.nextDouble();
        double Gx = sc.nextDouble();
        double Gy = sc.nextDouble() * -1;

        double v = (Gy - Sy) / (Gx - Sx);
        double v1 = v * Sx - Sy;

        System.out.println(v1 / v);
    }
}
