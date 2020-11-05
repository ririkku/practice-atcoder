package com.kiguri.atcoder.ARC022.SuperICT高校生;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/arc022/tasks/arc022_1
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        boolean f1 = false;
        int cnt = 0;
        char[] chars = S.toLowerCase().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'i') {
                f1 = true;
                break;
            }
            cnt++;
        }

        boolean f2 = false;
        for (int i = cnt; i < chars.length; i++) {
            if (chars[i] == 'c') {
                f2 = true;
                break;
            }
            cnt++;
        }

        boolean f3 = false;
        for (int i = cnt; i < chars.length; i++) {
            if (chars[i] == 't') {
                f3 = true;
                break;
            }
            cnt++;
        }

        if (f1 && f2 && f3) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
