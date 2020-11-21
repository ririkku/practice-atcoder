package com.kiguri.atcoder.ABC082.A_RoundUpTheMean;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc082/tasks/abc082_a
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal a = BigDecimal.valueOf(sc.nextInt());
        BigDecimal b = BigDecimal.valueOf(sc.nextInt());

        System.out.println(a.add(b).divide(BigDecimal.valueOf(2), RoundingMode.HALF_UP));
    }
}
