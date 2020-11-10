package com.kiguri.atcoder.code_festival_2014_quala.B_とても長い文字列;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/code-festival-2014-quala/tasks/code_festival_qualA_b
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int B = sc.nextInt();

        int x = B % A.length();
        if (x == 0) {
            System.out.println(A.charAt(A.length() - 1));
            return;
        }

        System.out.println(A.charAt(x - 1));
    }
}
