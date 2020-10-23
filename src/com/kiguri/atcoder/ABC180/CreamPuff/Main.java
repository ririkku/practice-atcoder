package com.kiguri.atcoder.ABC180.CreamPuff;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * https://atcoder.jp/contests/abc180/tasks/abc180_c
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Long.parseLong(scanner.next());

        TreeSet<Long> set = new TreeSet<>();
        for (long i = 1; i*i <= n; i++) {
            if (n % i == 0) {
//                System.out.println("====================");
//                System.out.println(i);
//                System.out.println(n/i);
                set.add(i);
                set.add(n / i);
            }
        }
        for (Long l : set) System.out.println(l);
    }
}
