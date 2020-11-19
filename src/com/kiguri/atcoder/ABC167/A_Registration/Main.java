package com.kiguri.atcoder.ABC167.A_Registration;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc167/tasks/abc167_a
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();

        if (S.equals(T.substring(0, S.length()))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
