package com.kiguri.atcoder.ABC122.A_DoubleHelix;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc122/tasks/abc122_a
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b = sc.next();

        if ("A".equals(b)) {
            System.out.println("T");
        } else if ("T".equals(b)) {
            System.out.println("A");
        } else if ("C".equals(b)) {
            System.out.println("G");
        } else if ("G".equals(b)) {
            System.out.println("C");
        }
    }
}
