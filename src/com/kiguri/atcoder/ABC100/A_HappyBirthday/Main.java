package com.kiguri.atcoder.ABC100.A_HappyBirthday;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc100/tasks/abc100_a
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if(A <= 8 && B <= 8) {
            System.out.println("Yay!");
        } else {
            System.out.println(":(");
        }
    }
}
