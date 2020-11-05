package com.kiguri.atcoder.ARC106._106;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * https://atcoder.jp/contests/arc106/tasks/arc106_a
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());

        for (int i = 1; i < 50; i++) {

            for (int j = 1; j < 50; j++) {

                BigDecimal a = BigDecimal.valueOf(3);
                BigDecimal b = BigDecimal.valueOf(5);
                BigDecimal pow1 = a.pow(i);
                BigDecimal pow2 = b.pow(j);

                if (BigDecimal.valueOf(n).equals(pow1.add(pow2))) {
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }
        System.out.println("-1");
    }
}
