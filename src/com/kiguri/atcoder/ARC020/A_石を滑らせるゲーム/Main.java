package com.kiguri.atcoder.ARC020.A_石を滑らせるゲーム;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/arc020/tasks/arc020_1
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Math.abs(sc.nextInt());
        int B = Math.abs(sc.nextInt());

        String ans;
        if (A < B) {
            ans = "Ant";
        } else if (A > B) {
            ans = "Bug";
        } else {
            ans = "Draw";
        }

        System.out.println(ans);
    }
}
