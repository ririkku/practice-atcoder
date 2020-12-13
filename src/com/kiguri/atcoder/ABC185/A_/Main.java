package com.kiguri.atcoder.ABC185.A_;

import java.util.Scanner;

/**
 *
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A1 = sc.nextInt();
        int A2 = sc.nextInt();
        int A3 = sc.nextInt();
        int A4 = sc.nextInt();

        System.out.println(Math.min(A1, Math.min(A2, Math.min(A3, A4))));
    }
}
