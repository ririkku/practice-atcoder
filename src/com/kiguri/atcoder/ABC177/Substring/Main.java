package com.kiguri.atcoder.ABC177.Substring;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc177/tasks/abc177_b
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();


        int ans = T.length();
        for (int i = 0; i <= S.length() - T.length(); i++) {

            int count = 0;
            for (int j = 0; j < T.length(); j++) {
                // Sを一文字ずつずらして、T1文字を比較していく
                // 一致しない場合のカウントを取得する
                // Tの形を崩さずにSを一文字ずつずらすことで、S[n]の位置でどれだけ書き換えが必要かがもとまる
                if (T.charAt(j) != S.charAt(i + j)) {
                    count++;
                }

            }
            // 全部計算し終わったところで、S[n]の位置で一番書き換えが多かったもので更新する
            ans = Math.min(ans, count);
        }


        System.out.println(ans);
    }
}
