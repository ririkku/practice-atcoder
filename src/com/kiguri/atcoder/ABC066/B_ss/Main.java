package com.kiguri.atcoder.ABC066.B_ss;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc066/tasks/abc066_b
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();


        for (int i = S.length() - 2; i >= 0; i = i - 2) {

            int i1 = i / 2;
            if (S.substring(0, i1).equals(S.substring(i1, i))) {
                System.out.println(i);
                return;
            }
        }

    }
}
