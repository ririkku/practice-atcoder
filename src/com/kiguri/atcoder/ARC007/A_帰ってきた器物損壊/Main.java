package com.kiguri.atcoder.ARC007.A_帰ってきた器物損壊;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/arc007/tasks/arc007_1
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String X = sc.next();
        String s = sc.next();

        String[] split = s.split(X);
        StringBuilder sb = new StringBuilder();
        for (String s1 : split) {
            sb.append(s1);
        }

        System.out.println(sb.toString());
    }
}
