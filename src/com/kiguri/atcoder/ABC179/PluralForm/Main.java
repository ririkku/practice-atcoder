package com.kiguri.atcoder.ABC179.PluralForm;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc179/tasks/abc179_a
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.next();
        if (w.endsWith("s")) {
            System.out.println(w + "es");
            return;
        }
        System.out.println(w + "s");
    }
}
