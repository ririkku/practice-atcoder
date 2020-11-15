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
        double Gy = sc.nextDouble();


        double a = Sx * Gy + Sy * Gx;
        double b = Sy + Gy;
        System.out.println(a / b);
    }
}
