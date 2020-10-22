package com.kiguri.atcoder.ABC042;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc042/tasks/abc042_a
 */
public class 和風いろはちゃんイージー {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i1 = Integer.parseInt(scanner.next());
        int i2 = Integer.parseInt(scanner.next());
        int i3 = Integer.parseInt(scanner.next());

        PrintWriter out = new PrintWriter(System.out);
        // 17
        if(i1 + i2 + i3 != 17) {
            out.println("NO");
            out.flush();
            return;
        }

        // 557, 575,
        if(i1 == 5) {
            if(i2 + i3 == 12) {
                out.println("YES");
                out.flush();
                return;
            }
        }
        // 755
        else if(i1 == 7) {
            if(i2 + i3 == 10) {
                out.println("YES");
                out.flush();
                return;
            }
        }

        out.println("NO");
        out.flush();
    }
}
