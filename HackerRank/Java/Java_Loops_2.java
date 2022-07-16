// https://www.hackerrank.com/challenges/java-loops/problem

import java.util.*;
import java.lang.Math;

public class Java_Loops_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int j = 0; j < t; j++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int sol = a;

            for (int i = 0; i < c; i++) {

                int result = (int) Math.pow(2, i) * b;
                sol = sol + result;
                System.out.print(sol + " ");

            }
            System.out.println();

        }
        sc.close();
    }
}
