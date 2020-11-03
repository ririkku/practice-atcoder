package com.kiguri.atcoder.ABC104.AcCepted;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc104/tasks/abc104_b
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] S = sc.next().toCharArray();

        String res = "AC";
        if (S[0] != 'A') {
            res = "WA";
        }

        // 1文字目を検査する必要はない
        int count = 0;
        for (int i = 1; i < S.length; i++) {

            if (Character.isUpperCase(S[i])) {

                // 大文字なのが、一文字目 || 末尾から1文字目 || 大文字C以外ならアウト
                if (i == 1 || i == S.length - 1 || S[i] != 'C') {
                    res = "WA";
                }

                // Cが1回ならOK、全部小文字=大文字が2回出てきたらアウト
                // C以外がアウトなのは、上記で確認済み
                count++;
            }

        }

        if (count != 1) {
            res = "WA";
        }

        System.out.println(res);
    }
}
