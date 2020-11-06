package com.kiguri.atcoder.tokiomarine2020.Tag;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/tokiomarine2020/tasks/tokiomarine2020_b
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long V = sc.nextLong();

        long B = sc.nextLong();
        long W = sc.nextLong();

        long T = sc.nextLong();

        long x = Math.abs(A - B); // AとBの位置
        long y = (V - W) * T; // 1秒ごとに縮まる差

        // 1秒ごとに縮まる差がAとBが離れている数を超えたとき
        if (x <= y) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
